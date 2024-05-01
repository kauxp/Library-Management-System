package com.example.librarymanagmentsystem.Controllers;


import com.example.librarymanagmentsystem.Models.bookModel.Book;
import com.example.librarymanagmentsystem.Models.bookModel.Genre;
import com.example.librarymanagmentsystem.services.bookService.LibraryBookService;
import com.example.librarymanagmentsystem.services.bookService.LibraryBookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private LibraryBookService bookService;
    public BookController(LibraryBookService bookService){
        this.bookService= bookService;
    }
    // Get Book by Title
    @GetMapping("title/{title}")
    public Book getBookByTitle(@PathVariable("title") String title) {
        Book book = bookService.getBookByTitle(title);
        return book;

    }

    // Get All Books by Author
    @GetMapping("author/{author}")
    public List<Book> getAllBookByAuthor(@PathVariable("author") String author) {
        List<Book> books= bookService.getAllBookByAuthor(author);
        return books;


    }

    // Get All Books by Genre
    @GetMapping("genre/{genre}")
    public List<Book> getAllBookByGenre(@PathVariable("genre") Genre genre) {
        List<Book> books= bookService.getAllBookByGenre(genre);
        return books;


    }

    // Get All Books
    @GetMapping
    public List<Book> getAllBooks() {
        List<Book> books= bookService.getAllBooks();
        return books;

    }

    // Create a Book
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    // Update a Book
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable("id") Long id, @RequestBody Book book) {
        Book newBook = bookService.updateBook(id, book);
        return newBook;
    }

    // Delete a Book
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}
