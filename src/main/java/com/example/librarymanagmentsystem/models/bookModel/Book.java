package com.example.librarymanagmentsystem.models.bookModel;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Book {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Author author;
    private Genre genre;
    private Date publicationDate;
    private String ISBN;
}
