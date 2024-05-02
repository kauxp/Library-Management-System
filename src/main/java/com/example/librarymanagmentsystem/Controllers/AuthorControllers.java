package com.example.librarymanagmentsystem.Controllers;

import com.example.librarymanagmentsystem.models.bookModel.Author;
import com.example.librarymanagmentsystem.services.authorService.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorControllers {
    private final AuthorService authorService;

    // Constructor
    public AuthorControllers(AuthorService authorService) {
        this.authorService = authorService;
    }

    // Get All Authors
    @GetMapping()
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    // Create or Update an Author
    @PostMapping()
    public Author createOrUpdateAuthor(@RequestBody Author author) {
        return authorService.createOrUpdateAuthor(author);
    }

    // Delete an Author
    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable("id") Long id) {
        authorService.deleteAuthor(id);
    }
}
