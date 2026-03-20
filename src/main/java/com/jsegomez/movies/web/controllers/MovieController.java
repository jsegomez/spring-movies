package com.jsegomez.movies.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsegomez.movies.domain.dto.MovieDto;
import com.jsegomez.movies.domain.services.MovieService;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieServ;

    public MovieController(MovieService movieServ) {
        this.movieServ = movieServ;
    }

    @GetMapping()
    public List<MovieDto> getAll(){
        return movieServ.findAll();
    }
}
