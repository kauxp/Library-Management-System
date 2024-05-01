package com.example.librarymanagmentsystem.services.patronService;

import com.example.librarymanagmentsystem.Exceptions.InvalidPatronException;
import com.example.librarymanagmentsystem.Models.patronModel.Patron;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PatronService {
    Patron getPatronById(Long id) throws InvalidPatronException;
    List<Patron> getAllPatrons();
    Patron createPatron(Patron patron);
    Patron updatePatron(Long id, Patron patron) throws InvalidPatronException;
    void deletePatron(Long id) throws InvalidPatronException;
}
