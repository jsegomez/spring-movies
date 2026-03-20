package com.jsegomez.movies.domain.services;

import org.springframework.stereotype.Service;

import com.jsegomez.movies.domain.dto.MovieDto;
import com.jsegomez.movies.domain.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDto> findAll() {
        return movieRepository.findAll();
    }
}
