package com.example.librarymanagmentsystem.Models.bookModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    private String title;
    @ManyToOne(cascade = CascadeType.ALL)
    private Author author;
    private Genre genre;
    private Date publicationDate;
    private String ISBN;
}
