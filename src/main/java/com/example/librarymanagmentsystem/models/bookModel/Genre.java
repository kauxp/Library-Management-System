package com.example.librarymanagmentsystem.models.bookModel;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
public enum Genre {
    FICTION,
    MYSTERY,
    THRILLER,
    SCIENCEFICTION,
    HISTORICALFICTION
}
