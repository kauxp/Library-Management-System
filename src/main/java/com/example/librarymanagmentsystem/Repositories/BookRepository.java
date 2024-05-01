package com.example.librarymanagmentsystem.Repositories;

import com.example.librarymanagmentsystem.Models.bookModel.Book;
import com.example.librarymanagmentsystem.Models.bookModel.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByBookId(Long id);

    Book findByTitle(String title);

    List<Book> findByAuthor_Name(String author);

    List<Book> findByGenre(Genre genre);

    List<Book> findAll();

    Book save(Book book);

    void delete(Book book);

//    List<Book> findBookByAuthor();
}
