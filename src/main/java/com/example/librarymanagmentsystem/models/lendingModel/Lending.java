package com.example.librarymanagmentsystem.Models.lendingModel;

import com.example.librarymanagmentsystem.Models.patronModel.Patron;
import com.example.librarymanagmentsystem.models.bookModel.Book;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public class Lending {
    private Long lendingID;
    private Book book;
    private Patron patron;
    private Date dateBorrowed;
    private Date dueDate;
}
