package com.example.librarymanagmentsystem.exceptions.patronexceptions;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatronNotFoundException extends RuntimeException{
    long id;
    public PatronNotFoundException(long id, String message) {
        super(message);
        this.id = id;
    }
}
