package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDataBase libraryDataBase;

    public BookLibrary(LibraryDataBase libraryDataBase) {
        this.libraryDataBase = libraryDataBase;
    }

    public List<Book> listBookTitleFrag(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if(titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDataBase.listBookTitleFrag(titleFragment);
        if(resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> libraryUserInHandsOf = libraryDataBase.listBookInPossessionOf(libraryUser);

        return libraryUserInHandsOf;
    }
}
