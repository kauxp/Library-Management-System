package com.example.librarymanagmentsystem.models.bookModel;
import com.example.librarymanagmentsystem.Models.bookModel.Author;
import com.example.librarymanagmentsystem.Models.bookModel.Genre;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Book {
    private Long id;
    private String title;
    private Author author;
    private Genre genre;
    private Date publicationDate;
    private String ISBN;
}
