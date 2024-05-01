package com.example.librarymanagmentsystem.Controllers;

import com.example.librarymanagmentsystem.Models.bookModel.Book;
import com.example.librarymanagmentsystem.Models.lendingModel.Lending;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/lendings")
public class LendingController {

    //  Get Lending by ID
    @GetMapping("/{id}")
    public Book getLendingById(@PathVariable("id") Long id) {
        return null;
    }

    // Get Lending by Patron ID
    @GetMapping("/{patronId}")
    public List<Book> getLendingByPatronId(@PathVariable("patronId") Long patronId) {
        return null;
    }

    // Get Lending by Book ID
    public Book getLendingByBookId(@PathVariable("bookId") Long bookId) {
        return null;
    }

    // Get Lending by Date
    @GetMapping("/{date}")
    public List<Book> getLendingByDate(@PathVariable("date") Date date) {
        return null;
    }

    // Get Lending by Due Date
    @GetMapping("/{dueDate}")
    public List<Book> getLendingByDueDate(@PathVariable("dueDate") Date dueDate) {
        return null;
    }

    // Get Lending by Lending Status
    @GetMapping("/{status}")
    public List<Book> getLendingByStatus(@PathVariable("status") String status) {
        return null;
    }

    //  Get all Lendings
    @GetMapping
    public List<Book> getAllLendings() {
        return null;
    }

    //  Create a Lending
    public Book createLending(@RequestBody Lending lending) {
        return null;
    }

    //  Update a Lending
    @PutMapping("/{lendingId}")
    public Book updateLending(@PathVariable("lendingId") Long lendingId, @RequestBody Lending lending) {
        return null;
    }
}
