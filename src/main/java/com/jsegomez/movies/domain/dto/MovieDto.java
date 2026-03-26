package com.jsegomez.movies.domain.dto;

import com.jsegomez.movies.persistence.entities.enums.Classification;
import com.jsegomez.movies.persistence.entities.enums.Genre;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public record MovieDto(
        Long id,

        @NotBlank(message = "Title is required")
        String title,

        @NotNull(message = "Duration is required")
        @Positive(message = "Duration must be a positive number")
        Integer duration,

        @NotNull(message = "Genre is required")
        Genre genre,

        @NotNull(message = "Classification is required")
        Classification classification,

        @NotNull(message = "Release date is required")
        LocalDate releaseDate,

        Boolean isAvailable
) {
}
