package com.example.librarymanagmentsystem.services.lendingService;

import com.example.librarymanagmentsystem.Models.lendingModel.Lending;
import com.example.librarymanagmentsystem.Models.patronModel.Patron;
import com.example.librarymanagmentsystem.Repositories.LendingRepository;
import com.example.librarymanagmentsystem.exceptions.booksexception.BookNotFoundException;
import com.example.librarymanagmentsystem.exceptions.lendingexceptions.LendingHistoryNotFoundException;
import com.example.librarymanagmentsystem.exceptions.patronexceptions.PatronNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Date;

import java.util.*;

@Service
public class LibraryLendingService implements LendingService{
    private final LendingRepository lendingRepository;

    LibraryLendingService(LendingRepository lendingRepository){
        this.lendingRepository=lendingRepository;
    }

    @Override
    public Lending getLendingById(Long id) throws LendingHistoryNotFoundException {
        Lending lending= lendingRepository.findByLendingID(id);
        if(lending==null){
            throw new LendingHistoryNotFoundException(id, "Invalid Lending ID");
        }
        return lending;
    }

    @Override
    public List<Lending> getAllLendings() {
        List<Lending> lendings= lendingRepository.findAll();
        return lendings;
    }

    @Override
    public Lending createLending(Lending lending) {
        return lendingRepository.save(lending);
    }

    @Override
    public Lending updateLending(Long id, Lending newLending) throws LendingHistoryNotFoundException {
        Lending lending = lendingRepository.findByLendingID(id);
        if(lending==null){
            throw new LendingHistoryNotFoundException(id, "Invalid Lending ID");
        }
        this.update(lending, newLending);
        return newLending;
    }

    @Override
    public void deleteLending(Long id) throws LendingHistoryNotFoundException {
        Lending lending = lendingRepository.findByLendingID(id);
        if(lending==null){
            throw new LendingHistoryNotFoundException(id, "Invalid Lending ID");
        }
        lendingRepository.delete(lending);
    }

//    @Override
//    public List<Lending> getLendingByPatronId(Long id) {
//        List<Lending> lending = lendingRepository.findByPatronPatronId(id);
//        if (lending == null) {
//            throw new PatronNotFoundException(id, "Invalid Patron ID");
//        }
//        return lending;
//    }



//    @Override
//    public List<Lending> getLendingByBookTitle(String title) {
//        List<Lending> lending = lendingRepository.findByBookTitle(title);
//        if (lending == null) {
//            throw new BookNotFoundException(title, "Invalid Book ID");
//        }
//        return lending;
//    }

    @Override
    public List<Lending> getLendingByLendingDate(Date date) {
        List<Lending> lending = lendingRepository.findByDateBorrowed(date);
        if (lending == null) {
            throw new LendingHistoryNotFoundException(Long.parseLong(String.valueOf(date)), "Invalid Lending Date");
        }
        return lending;
    }

    @Override
    public List<Lending> getLendingByDueDate(Date dueDate) {
        List<Lending> lending = lendingRepository.findByDueDate(dueDate);
        if (lending == null) {
            throw new LendingHistoryNotFoundException(Long.parseLong(String.valueOf(dueDate)), "Invalid Due Date");
        }
        return lending;
    }

    @Override
    public List<Lending> getLendingByStatus(Enum status) {
        List<Lending> lending = lendingRepository.findByLendingStatus(status);
        if (lending == null) {
            throw new LendingHistoryNotFoundException(Long.parseLong(String.valueOf(status)), "Invalid Status");
        }
        return lending;
    }

    private Lending update(Lending lending, Lending newLending){
        newLending.setLendingID(lending.getLendingID());
//        lending.setPatron(newLending.getPatron());
//        lending.setBook(newLending.getBook());
        lending.setDateBorrowed(newLending.getDateBorrowed());
        lending.setDueDate(newLending.getDueDate());
        lending.setLendingStatus(newLending.getLendingStatus());
        lendingRepository.save(newLending);
        return lending;
    }
}
