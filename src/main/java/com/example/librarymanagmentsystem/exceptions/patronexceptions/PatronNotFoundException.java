package com.example.librarymanagmentsystem.exceptions.patronexceptions;

public class PatronNotFoundException extends RuntimeException{
    long id;
    public PatronNotFoundException(long id, String message) {
        super(message);
        this.id = id;
    }
}
