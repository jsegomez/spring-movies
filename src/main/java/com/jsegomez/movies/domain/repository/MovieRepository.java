package com.jsegomez.movies.domain.repository;

import java.util.List;

import com.jsegomez.movies.domain.dto.MovieDto;

public interface MovieRepository {
    List<MovieDto> findAll();
}
