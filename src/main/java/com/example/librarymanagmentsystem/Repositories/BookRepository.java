package com.example.librarymanagmentsystem.Repositories;
import com.example.librarymanagmentsystem.models.bookModel.Book;

import java.util.List;

public interface BookRepository {
    Book findById(Long id);
    Book findByTitle(String title);
    List<Book> findByAuthor(String title);
    List<Book> findByGenre(String genre);
    List<Book> getAll();
    Book save(Book book);
    void delete(Book book);
}
