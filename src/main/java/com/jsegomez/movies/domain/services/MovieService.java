package com.jsegomez.movies.domain.services;

import org.springframework.stereotype.Service;

import com.jsegomez.movies.domain.dto.MovieDto;
import com.jsegomez.movies.domain.exceptions.ResourceNotFoundException;
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

    public MovieDto findById(Long id) {
        return movieRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Movie", id));
    }

    public MovieDto create(MovieDto movieDto) {
        return movieRepository.save(movieDto);
    }
}
