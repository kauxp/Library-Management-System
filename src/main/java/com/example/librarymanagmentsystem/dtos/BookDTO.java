package com.example.librarymanagmentsystem.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BookDTO {
    private long id;
    private String title;
    private long authorId;
    private String genre;
    private Date publicationDate;
    private String ISBN;
}
