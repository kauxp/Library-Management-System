package com.example.librarymanagmentsystem.exceptions.booksexception;
import com.example.librarymanagmentsystem.models.bookModel.Genre;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenreNotFoundException extends RuntimeException{
    private Genre genre;

    public GenreNotFoundException( String message, Genre genre) {
        super(message);
        this.genre = genre;
    }
}
