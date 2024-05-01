package com.example.librarymanagmentsystem.dtos;

import jakarta.persistence.ManyToOne;
import com.example.librarymanagmentsystem.models.bookModel.*;
import com.example.librarymanagmentsystem.models.patronModel.*;
import com.example.librarymanagmentsystem.Models.lendingModel.LendingStatus;
import java.util.Date;

public class LendingDTO {
    private Long lendingID;
    @ManyToOne
    private com.example.librarymanagmentsystem.Models.bookModel.Book bookID;
    @ManyToOne
    private com.example.librarymanagmentsystem.Models.patronModel.Patron patronID;
    private Date dateBorrowed;
    private Date dueDate;
    private Date dateReturned;
    private LendingStatus lendingStatus;
}
