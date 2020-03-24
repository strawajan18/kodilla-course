package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDataBase {
    //Books with title fragment
    List<Book> listBookTitleFrag(String titleFragment);

    //Books borrowed by library users
    List<Book> listBookInPossessionOf(LibraryUser libraryUser);

    //Rent availability
    boolean rentABook(LibraryUser libraryUser, Book book);

    //Numbers of Books returned back
    int returnBooks(LibraryUser libraryUser);
}
