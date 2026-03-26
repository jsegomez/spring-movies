package com.jsegomez.movies.domain.repository;

import java.util.List;
import java.util.Optional;

import com.jsegomez.movies.domain.dto.MovieDto;

public interface MovieRepository {
    List<MovieDto> findAll();
    Optional<MovieDto> findById(long id);
    MovieDto save(MovieDto movieDto);
}
