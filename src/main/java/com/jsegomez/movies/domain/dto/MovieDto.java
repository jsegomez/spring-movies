package com.jsegomez.movies.domain.dto;

import com.jsegomez.movies.persistence.entities.enums.Classification;
import com.jsegomez.movies.persistence.entities.enums.Genre;

import java.time.LocalDate;

public record MovieDto(
        String title,
        Integer duration,
        Genre genre,
        Classification classification,
        LocalDate releaseDate,
        Boolean isAvailable
) {
}
