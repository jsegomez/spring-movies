package com.jsegomez.movies.persistence.entities;

import com.jsegomez.movies.persistence.entities.enums.Classification;
import com.jsegomez.movies.persistence.entities.enums.Genre;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movies")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mv_id")
    private Long mvId;

    @Column(name = "mv_title", nullable = false, length = 200, unique = true)
    private String mvTitle;

    @Column(name = "mv_duration", nullable = false, precision = 3)
    private Integer mvDuration;

    @Enumerated(EnumType.STRING)
    @Column(name = "mv_genre", nullable = false)
    private Genre mvGenre;

    @Enumerated(EnumType.STRING)
    @Column(name = "mv_classification", nullable = false)
    private Classification mvClassification;

    @Column(name = "mv_release_date", nullable = true)
    private LocalDate mvReleaseDate;

    @Column(name = "mv_is_available", nullable = false)
    private Boolean mvIsAvailable;
}
