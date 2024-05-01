package com.example.librarymanagmentsystem.services.authorService;

import com.example.librarymanagmentsystem.Models.bookModel.Author;
import com.example.librarymanagmentsystem.Repositories.AuthorRepository;
import com.example.librarymanagmentsystem.exceptions.booksexception.AuthorNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryAuthorService implements AuthorService{
    AuthorRepository authorRepository;
    LibraryAuthorService(AuthorRepository authorRepository){

        this.authorRepository = authorRepository;
    }

    @Override
    public Author getAuthorByName(String name) throws AuthorNotFoundException {
        Author author = authorRepository.findByName(name);
        if(author==null){
            throw new AuthorNotFoundException("Invalid Author", name);
        }
        return author;
    }

    @Override
    public List<Author> getAllAuthors() {

        return authorRepository.findAll();
    }

    @Override
    public Author createAuthor(Author author) {

        return authorRepository.save(author);
    }

    @Override
    public Author updateAuthor(Long id, Author newAuthor) {
        Author author = authorRepository.findById(id).get();
        author = update(author, newAuthor);
        return author;
    }

    @Override
    public void deleteAuthor(Long id) {
        Author author = authorRepository.findById(id).get();
        authorRepository.delete(author);
    }

    private Author update(Author author, Author newAuthor){
        newAuthor.setId(author.getId());
        author.setName(newAuthor.getName());
        author.setDob(newAuthor.getDob());
        authorRepository.save(newAuthor);
        return author;
    }

    @Override
    public Author getAuthorById(Long id) {

        return authorRepository.findById(id).get();
    }
}
