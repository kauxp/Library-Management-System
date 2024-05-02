package com.example.librarymanagmentsystem.dtos;

import com.example.librarymanagmentsystem.models.bookModel.Genre;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class BookDTO {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private long authorId;
    private Genre genre;
    private Date publicationDate;
    private String ISBN;
}
