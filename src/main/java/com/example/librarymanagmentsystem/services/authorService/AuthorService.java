package com.example.librarymanagmentsystem.services.authorService;

import com.example.librarymanagmentsystem.Models.bookModel.Author;

import java.util.List;

public interface AuthorService {
    Author getAuthorByName(String name);

    List<Author> getAllAuthors();

    Author createAuthor(Author author);

    Author updateAuthor(Long id, Author author);

    void deleteAuthor(Long id);

}
