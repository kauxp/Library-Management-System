package com.example.librarymanagmentsystem.dtos;

import jakarta.persistence.ManyToOne;
import com.example.librarymanagmentsystem.models.bookModel.Book;
import com.example.librarymanagmentsystem.models.patronModel.Patron;
import com.example.librarymanagmentsystem.Models.lendingModel.LendingStatus;
import java.util.Date;

public class LendingDTO {
    private Long lendingID;
    @ManyToOne
    private Book bookID;
    @ManyToOne
    private Patron patronID;
    private Date dateBorrowed;
    private Date dueDate;
    private Date dateReturned;
    private LendingStatus lendingStatus;
}
