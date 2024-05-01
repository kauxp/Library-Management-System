package com.example.librarymanagmentsystem.exceptions.booksexception;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenreNotFoundException extends RuntimeException{
    private String genre;

    public GenreNotFoundException(String genre, String message) {
        super(message);
        this.genre = genre;
    }
}
