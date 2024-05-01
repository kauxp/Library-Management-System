package com.example.librarymanagmentsystem.services.bookService;

import com.example.librarymanagmentsystem.Models.bookModel.Genre;
import com.example.librarymanagmentsystem.Repositories.BookRepository;
import com.example.librarymanagmentsystem.Models.bookModel.Book;
import com.example.librarymanagmentsystem.exceptions.booksexception.BookNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryBookService implements BookService{
    private final BookRepository bookRepository;
    public LibraryBookService(BookRepository bookRepository){
        this.bookRepository= bookRepository;
    }

    @Override
    public Book getBookByTitle(String title){
        Book book= bookRepository.findByTitle(title);
        return book;
    }

    @Override
    public List<Book> getAllBookByAuthor(String author){
        List<Book> books= bookRepository.findByAuthor_Name(author);
        return books;
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
        return bookRepository.save(book);
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
