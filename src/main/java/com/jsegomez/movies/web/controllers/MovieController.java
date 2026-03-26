package com.jsegomez.movies.web.controllers;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.jsegomez.movies.domain.dto.MovieDto;
import com.jsegomez.movies.domain.services.MovieService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieServ;

    public MovieController(MovieService movieServ) {
        this.movieServ = movieServ;
    }

    @GetMapping
    public ResponseEntity<List<MovieDto>> getAll(){
        return ResponseEntity.ok(movieServ.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieDto> getById(@PathVariable Long id){
        return ResponseEntity.ok(movieServ.findById(id));
    }

    @PostMapping
    public ResponseEntity<MovieDto> create(@Valid @RequestBody MovieDto movieDto){
        MovieDto created = movieServ.create(movieDto);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(created.id())
                .toUri();
        return ResponseEntity.created(location).body(created);
    }
}