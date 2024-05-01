package com.example.librarymanagmentsystem.services.bookService;

import com.example.librarymanagmentsystem.Repositories.BookRepository;
import com.example.librarymanagmentsystem.models.bookModel.Book;

import java.util.List;

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
        List<Book> books= bookRepository.findByAuthor(author);
        return books;
    }
    @Override
    public List<Book> getAllBookByGenre(String genre){
        List<Book> books= bookRepository.findByGenre(genre);
        return books;
    }
    @Override

    public List<Book> getAllBooks(){
        List<Book> books= bookRepository.getAll();
        return books;
    }

    @Override
    public Book createBook(Book book){
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Long id, Book newBook){
        Book book = bookRepository.findById(id);
        book= update(book, newBook);
        return book;
    }

    @Override
    public void deleteBook(Long id){
        Book book = bookRepository.findById(id);
        bookRepository.delete(book);
    }

    private Book update(Book book, Book newBook){
        book.setId(newBook.getId());
        book.setAuthor(newBook.getAuthor());
        book.setTitle(newBook.getTitle());
        book.setGenre(newBook.getGenre());
        book.setISBN(newBook.getISBN());
        return book;
    }
}
