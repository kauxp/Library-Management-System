package com.example.librarymanagmentsystem.services.lendingService;

import com.example.librarymanagmentsystem.Models.lendingModel.Lending;
import com.example.librarymanagmentsystem.exceptions.lendingexceptions.LendingHistoryNotFoundException;

import java.util.Date;
import java.util.*;

public interface LendingService {
    Lending getLendingById(Long id) throws LendingHistoryNotFoundException;
    List<Lending> getAllLendings();
    Lending createLending(Lending lending);
    Lending updateLending(Long id, Lending lending) throws LendingHistoryNotFoundException;
    void deleteLending(Long id) throws LendingHistoryNotFoundException;
//    List<Lending> getLendingByPatronId(Long id);
//    List<Lending> getLendingByBookTitle(String title);
    List<Lending> getLendingByLendingDate(Date date);
    List<Lending> getLendingByDueDate(Date dueDate);
    List<Lending> getLendingByStatus(Enum status);
}
