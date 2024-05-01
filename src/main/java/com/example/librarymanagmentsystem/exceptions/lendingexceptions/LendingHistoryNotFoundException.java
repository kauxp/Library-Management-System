package com.example.librarymanagmentsystem.exceptions.lendingexceptions;

public class LendingHistoryNotFoundException extends RuntimeException{
    long id;
    public LendingHistoryNotFoundException(long id, String message) {
        super(message);
        this.id = id;
    }
}
