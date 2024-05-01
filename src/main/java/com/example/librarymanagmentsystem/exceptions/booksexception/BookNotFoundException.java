package com.example.librarymanagmentsystem.exceptions.booksexception;

public class BookNotFoundException extends RuntimeException{
    private String title;

    public BookNotFoundException(String title, String message) {
        super(message);
        this.title = title;
    }
}
