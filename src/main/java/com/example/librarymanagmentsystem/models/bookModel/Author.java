package com.example.librarymanagmentsystem.Models.bookModel;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Date;

@Getter
@Setter

public class Author {
    private long id;
    private String name;
    private Date dob;
}
