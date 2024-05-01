package com.example.librarymanagmentsystem.Controllers;

import com.example.librarymanagmentsystem.Models.patronModel.Patron;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patrons")
public class PatronController {

    // Get Patron by ID's
    @GetMapping("/{id}")
    public Patron getPatronById(@PathVariable("id") Long id) {
        return null;
    }


    //Get all Patrons
    @GetMapping
    public List<Patron> getAllPatrons() {
        return null;
    }

    @PostMapping
    public Patron createPatron(@RequestBody Patron patron) {
        return null;
    }

    // Update Patron
    @PutMapping("/{id}")
    public Patron updatePatron(@PathVariable("id") Long id, @RequestBody Patron patron) {
        return null;
    }

    // Delete Patron
    @DeleteMapping("/{id}")
    public void deletePatron(@PathVariable("id") Long id) {
    }
}
