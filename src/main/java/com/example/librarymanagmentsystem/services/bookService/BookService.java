package com.example.librarymanagmentsystem.services.bookService;
//package com.example.librarymanagmentsystem.models.bookModel.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.librarymanagmentsystem.models.bookModel.Book;
import java.util.List;

public interface BookService {
    Book getBookByTitle(String title);
    List<Book> getAllBookByAuthor(String author);
    List<Book> getAllBookByGenre(String genre);
    List<Book> getAllBooks();
    Book createBook(Book book);
    Book updateBook(Long id, Book book);
    void deleteBook(Long id);
}
