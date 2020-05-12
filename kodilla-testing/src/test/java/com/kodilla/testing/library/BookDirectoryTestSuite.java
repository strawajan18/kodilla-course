package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDataBase libraryDatabaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBookTitleFrag(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBookTitleFrag("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBookTitleFrag("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBookTitleFrag("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBookTitleFrag("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBookTitleFrag("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }
    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDataBase libraryDatabaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBookTitleFrag(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBookTitleFrag("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBookTitleFrag(anyString());
    }

    @Test
    public void testWithLibraryUserWithZeroBooks() {
        //Given
        List<Book> listOfZeroBooks = new ArrayList<>();
        LibraryDataBase libraryDataBaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        LibraryUser libraryUser = new LibraryUser("Tomek","Nowak","00222745628");
        when(libraryDataBaseMock.listBookInPossessionOf(libraryUser)).thenReturn(listOfZeroBooks);
        //When
        List<Book> theListBook = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(0, theListBook.size());
        verify(libraryDataBaseMock, times(1)).listBookInPossessionOf(libraryUser);
    }

    @Test
    public void testWithLibraryUserWithOneBook() {
        //Given
        List<Book> listOfOneBook = generateListOfNBooks(1);
        LibraryDataBase libraryDataBaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        LibraryUser libraryUser = new LibraryUser("Tomek","Nowak","00222745628");
        when(libraryDataBaseMock.listBookInPossessionOf(libraryUser)).thenReturn(listOfOneBook);
        //When
        List<Book> theListBook = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(1,theListBook.size());
        verify(libraryDataBaseMock, times(1)).listBookInPossessionOf(libraryUser);
    }

    @Test
    public void testWithLibraryUserWith5Books() {
        //Given
        List<Book> listOfFiveBooks = generateListOfNBooks(5);
        LibraryDataBase libraryDataBaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        LibraryUser libraryUser = new LibraryUser("Tomek","Nowak","00222745628");
        when(libraryDataBaseMock.listBookInPossessionOf(libraryUser)).thenReturn(listOfFiveBooks);
        //When
        List<Book> theBookList = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        assertEquals(5,theBookList.size());
        verify(libraryDataBaseMock, times(1)).listBookInPossessionOf(libraryUser);
    }
}
