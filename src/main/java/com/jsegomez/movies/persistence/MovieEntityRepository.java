package com.jsegomez.movies.persistence;

import org.springframework.stereotype.Repository;
import java.util.List;

import com.jsegomez.movies.domain.dto.MovieDto;
import com.jsegomez.movies.domain.repository.MovieRepository;

import com.jsegomez.movies.persistence.crud.CrudMovieEntity;
import com.jsegomez.movies.persistence.mapper.MovieMapper;

@Repository
public class MovieEntityRepository implements MovieRepository {
    private final CrudMovieEntity crudMovieEntity;
    private final MovieMapper  movieMapper;

    public MovieEntityRepository(CrudMovieEntity crudMovieEntity,  MovieMapper movieMapper) {
        this.crudMovieEntity = crudMovieEntity;
        this.movieMapper = movieMapper;
    }

    @Override
    public List<MovieDto> findAll() {
        return this.movieMapper.toDtoList(crudMovieEntity.findAll());
    }
}
