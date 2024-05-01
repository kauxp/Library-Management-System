package com.example.librarymanagmentsystem.Models.patronModel;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public class Patron {
    private Long patronID;
    private String name;
    private String email;
    private Date registrationDate;
}
