package com.example.librarymanagmentsystem.services.bookService;

import com.example.librarymanagmentsystem.Models.bookModel.Author;
import com.example.librarymanagmentsystem.Models.bookModel.Genre;
import com.example.librarymanagmentsystem.Repositories.AuthorRepository;
import com.example.librarymanagmentsystem.Repositories.BookRepository;
import com.example.librarymanagmentsystem.Models.bookModel.Book;
import com.example.librarymanagmentsystem.exceptions.booksexception.BookNotFoundException;
import com.example.librarymanagmentsystem.services.authorService.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryBookService implements BookService{
    private final BookRepository bookRepository;

    private final AuthorService authorService;
    private final AuthorRepository authorRepository;

    public LibraryBookService(BookRepository bookRepository, AuthorService authorService, AuthorRepository authorRepository){
        this.bookRepository= bookRepository;
        this.authorService= authorService;
        this.authorRepository = authorRepository;
    }

    @Override
    public Book getBookByTitle(String title){
        Book book= bookRepository.findByTitle(title);
        return book;
    }

    @Override
    public List<Book> getAllBookByAuthor(String name){
        Author author = authorService.getAuthorByName(name);
        List<Book> book= bookRepository.findBookByAuthor(author);
        return book;
    }
    @Override
    public List<Book> getAllBookByGenre(Genre genre){
        List<Book> books= bookRepository.findByGenre(genre);
        return books;
    }
    @Override

    public List<Book> getAllBooks(){
        List<Book> books= bookRepository.findAll();
        return books;
    }

    @Override
    public Book createBook(Book book){
    Author author = book.getAuthor();
    Book book1 = bookRepository.save(book);
    Optional<Author> optionalAuthor = authorRepository.findById(author.getId());
    book1.setAuthor(optionalAuthor.get());
    return book1;
}


    @Override
    public Book updateBook(Long id, Book newBook){
        Book book = bookRepository.findByBookId(id);
        book= update(book, newBook);
        return book;
    }

    @Override
    public void deleteBook(Long id){
        Book book = bookRepository.findByBookId(id);
        if (book == null){
            throw new BookNotFoundException("neel","Book with id "+id+" not found");
        }
        bookRepository.delete(book);
    }

    private Book update(Book book, Book newBook){
        newBook.setBookId(book.getBookId());
        book.setBookId(newBook.getBookId());
        book.setAuthor(newBook.getAuthor());
        book.setTitle(newBook.getTitle());
        book.setGenre(newBook.getGenre());
        book.setISBN(newBook.getISBN());
        bookRepository.save(newBook);

        return book;
    }
}
