package com.example.librarymanagmentsystem.Models.lendingModel;

import com.example.librarymanagmentsystem.Models.patronModel.Patron;
import com.example.librarymanagmentsystem.Models.bookModel.Book;
import com.example.librarymanagmentsystem.Models.lendingModel.LendingStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Lending {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lendingID;
    @ManyToOne
    private Book book;
    @ManyToOne
    private Patron patron;
    private Date dateBorrowed;
    private Date dueDate;
    private Date dateReturned;
    private LendingStatus lendingStatus;
}
