package com.example.librarymanagmentsystem.Repositories;

import com.example.librarymanagmentsystem.Models.lendingModel.Lending;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface LendingRepository extends JpaRepository<Lending, Long>
{
    @Override
    // Get all Lendings
    List<Lending> findAll();

    // Get Lending by ID
    Lending findByLendingID(Long id);

    // Save Lending
    Lending save(Lending lending);

    // Delete Lending
    void delete(Lending lending);

    // Get Lending by Patron ID
//    List<Lending> findByPatronPatronId(Long id);

    // Get Lending by Book ID
//    List<Lending> findByBookTitle(String title);

    // Get Lending by Lending Date
    List<Lending> findByDateBorrowed(Date date);

    // Get Lending by Due Date
    List<Lending> findByDueDate(Date dueDate);

    // Get Lending by Lending Status
    List<Lending> findByLendingStatus(Enum status);

}
