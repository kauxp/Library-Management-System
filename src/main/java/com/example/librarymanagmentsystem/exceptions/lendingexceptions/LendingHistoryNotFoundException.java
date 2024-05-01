package com.example.librarymanagmentsystem.exceptions.lendingexceptions;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LendingHistoryNotFoundException extends RuntimeException{
    long id;
    public LendingHistoryNotFoundException(long id, String message) {
        super(message);
        this.id = id;
    }
}
