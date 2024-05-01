package com.example.librarymanagmentsystem.Repositories;

import com.example.librarymanagmentsystem.Models.bookModel.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author findByName(String name);
}
