package com.example.librarymanagmentsystem.Controllers;


import com.example.librarymanagmentsystem.Models.bookModel.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    // Get Book by Title
    @GetMapping("/{title}")
    public Book getBookByTitle(@PathVariable("title") String title) {
        return null;
    }

    // Get All Books by Author
    @GetMapping("/{author}")
    public List<Book> getAllBookByAuthor(@PathVariable("author") String author) {
        return null;
    }

    // Get All Books by Genre
    @GetMapping("/{genre}")
    public List<Book> getAllBookByGenre(@PathVariable("genre") String genre) {
        return null;
    }

    // Get All Books
    @GetMapping
    public List<Book> getAllBooks() {
        return null;
    }

    // Create a Book
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return null;
    }

    // Update a Book
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable("id") Long id, @RequestBody Book book) {
        return null;
    }

    // Delete a Book
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") Long id) {
    }

}
