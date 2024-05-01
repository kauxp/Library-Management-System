package com.example.librarymanagmentsystem.exceptions.booksexception;

public class GenreNotFoundException extends RuntimeException{
    private String genre;

    public GenreNotFoundException(String genre, String message) {
        super(message);
        this.genre = genre;
    }
}
