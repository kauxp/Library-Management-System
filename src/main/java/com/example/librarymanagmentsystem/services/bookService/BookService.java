package com.example.librarymanagmentsystem.services.bookService;
//package com.example.librarymanagmentsystem.models.bookModel.Book;

import com.example.librarymanagmentsystem.Models.bookModel.Book;
import com.example.librarymanagmentsystem.Models.bookModel.Genre;

import java.util.List;

public interface BookService {
    Book getBookByTitle(String title);

    List<Book> getAllBookByAuthor(String author);

    List<Book> getAllBookByGenre(Genre genre);

    List<Book> getAllBooks();

    Book createBook(Book book);

    Book updateBook(Long id, Book book);

    void deleteBook(Long id);
}
