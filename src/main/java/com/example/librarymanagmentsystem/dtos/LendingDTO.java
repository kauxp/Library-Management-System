package com.example.librarymanagmentsystem.dtos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import com.example.librarymanagmentsystem.Models.bookModel.*;
import com.example.librarymanagmentsystem.Models.patronModel.*;
import com.example.librarymanagmentsystem.Models.lendingModel.LendingStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LendingDTO {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lendingID;
    private String bookTitle;
    private Long patronID;
    private Date dateBorrowed;
    private Date dueDate;
    private Date dateReturned;
    private LendingStatus lendingStatus;
}
