package com.example.librarymanagmentsystem.Controllers;

import com.example.librarymanagmentsystem.Models.bookModel.Book;
import com.example.librarymanagmentsystem.Models.lendingModel.Lending;
import com.example.librarymanagmentsystem.services.lendingService.LendingService;
import org.springframework.web.bind.annotation.*;

//import java.util.Date;
import java.util.*;
import java.util.Date;

@RestController
@RequestMapping("/lendings")
public class LendingController {
    LendingService lendingService;
    LendingController(LendingService lendingService) {
        this.lendingService = lendingService;
    }

    //  Get Lending by ID
    @GetMapping("/{id}")
    public Lending getLendingById(@PathVariable("id") Long id) {
        return lendingService.getLendingById(id);
    }

    // Get Lending by Patron ID
//    @GetMapping("/{patronId}")
//    public List<Lending> getLendingByPatronId(@PathVariable("patronId") Long patronId) {
//        return lendingService.getLendingByPatronId(patronId);
//    }

    // Get Lending by Book ID
//    @GetMapping("/{bookTitle}")
//    public List<Lending> getLendingByBookTitle(@PathVariable("bookTitle") String bookTitle) {
//        return lendingService.getLendingByBookTitle(bookTitle);
//    }

    // Get Lending by Date
    @GetMapping("/{date}")
    public List<Lending> getLendingByDate(@PathVariable("date") Date date) {
        return lendingService.getLendingByLendingDate(date);
    }

    // Get Lending by Due Date
    @GetMapping("/{dueDate}")
    public List<Lending> getLendingByDueDate(@PathVariable("dueDate") Date dueDate) {
        return lendingService.getLendingByDueDate(dueDate);
    }

    // Get Lending by Lending Status
    @GetMapping("status/{status}")
    public List<Lending> getLendingByStatus(@PathVariable("status") Enum status) {
        return lendingService.getLendingByStatus(status);
    }

    //  Get all Lendings
    @GetMapping
    public List<Lending> getAllLendings() {
        return lendingService.getAllLendings();
    }

    //  Create a Lending
    @PostMapping
    public Lending createLending(@RequestBody Lending lending) {
        return lendingService.createLending(lending);
    }

    //  Update a Lending
    @PutMapping("/{lendingId}")
    public Lending updateLending(@PathVariable("lendingId") Long lendingId, @RequestBody Lending lending) {
        return lendingService.updateLending(lendingId, lending);
    }

    //  Delete a Lending
    @DeleteMapping("/{lendingId}")
    public void deleteLending(@PathVariable("lendingId") Long lendingId) {
        lendingService.deleteLending(lendingId);
    }
}
