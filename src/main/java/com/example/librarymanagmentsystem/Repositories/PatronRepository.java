package com.example.librarymanagmentsystem.Repositories;

import com.example.librarymanagmentsystem.Models.patronModel.Patron;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatronRepository extends JpaRepository<Patron, Integer> {

    Patron findByPatronID(Long patronId);
    List<Patron> getAll();
    Patron save(Patron patron);
    void delete(Patron patron);
}
