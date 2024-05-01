package com.example.librarymanagmentsystem.services.patronService;

import com.example.librarymanagmentsystem.Exceptions.InvalidPatronException;
import com.example.librarymanagmentsystem.Models.patronModel.Patron;
import com.example.librarymanagmentsystem.Repositories.PatronRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryPatronService implements PatronService{
    private final PatronRepository patronRepository;

    public LibraryPatronService(PatronRepository patronRepository){
        this.patronRepository=patronRepository;
    }
    @Override
    public Patron getPatronById(Long id)  throws InvalidPatronException {
        Patron patron= patronRepository.findByPatronID(id);
        if(patron==null){
            throw new InvalidPatronException("Invalid Patron ID");
        }
        return patron;
    }

    @Override
    public List<Patron> getAllPatrons(){
        List<Patron> patrons= patronRepository.getAll();
        return patrons;
    }

    @Override
    public Patron createPatron(Patron patron){
        patronRepository.save(patron);
        return patron;
    }

    @Override
    public Patron updatePatron(Long id, Patron newPatron) throws InvalidPatronException{
        Patron patron = patronRepository.findByPatronID(id);
        if(patron==null){
            throw new InvalidPatronException("Invalid Patron ID");
        }

        this.update(patron, newPatron);
        return newPatron;
    }

    @Override
    public void deletePatron(Long id) throws InvalidPatronException{
        Patron patron = patronRepository.findByPatronID(id);
        if(patron==null){
            throw new InvalidPatronException("Invalid Patron ID");
        }
        patronRepository.delete(patron);
    }

    private Patron update(Patron patron, Patron newPatron){
        patron.setPatronID(newPatron.getPatronID());
        patron.setName(newPatron.getName());
        patron.setEmail(newPatron.getEmail());
        patron.setRegistrationDate(newPatron.getRegistrationDate());
        return patron;
    }
}
