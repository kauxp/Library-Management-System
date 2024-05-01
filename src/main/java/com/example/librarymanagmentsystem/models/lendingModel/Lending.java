package com.example.librarymanagmentsystem.models.lendingModel;


import com.example.librarymanagmentsystem.models.bookModel.Book;
import com.paramjeet.librarymanagement.librarymanagement.models.patronModel.Patron;
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
