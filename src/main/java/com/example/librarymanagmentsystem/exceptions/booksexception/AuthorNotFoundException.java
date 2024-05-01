package com.example.librarymanagmentsystem.exceptions.booksexception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorNotFoundException extends RuntimeException{
    private String name;

    public AuthorNotFoundException(String name, String message) {
        super(message);
        this.name = name;
    }
}
