package com.example.librarymanagmentsystem.exceptions.booksexception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookNotFoundException extends RuntimeException{
    private String title;

    public BookNotFoundException(String title, String message) {
        super(message);
        this.title = title;
    }
}
