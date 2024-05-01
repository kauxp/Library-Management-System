package com.example.librarymanagmentsystem.Repositories;

import com.example.librarymanagmentsystem.Models.bookModel.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author findByName(String name);
    Author save(Author author);
    void delete(Author author);
}
