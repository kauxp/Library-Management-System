package com.example.librarymanagmentsystem.Repositories;

import com.example.librarymanagmentsystem.Models.bookModel.Book;
import com.example.librarymanagmentsystem.Models.lendingModel.Lending;
import com.example.librarymanagmentsystem.Models.lendingModel.LendingStatus;
import com.example.librarymanagmentsystem.Models.patronModel.Patron;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface LendingRepository extends JpaRepository<Lending, Long> {


    Lending findByLendingID(Long id);

    List<Lending> findByBook(Book book);

    List<Lending> findByPatron(Patron patron);

    List<Lending> findByDateBorrowed(Date date);

    List<Lending> findByDueDate(Date dueDate);

    List<Lending> findByLendingStatus(LendingStatus status);

}
