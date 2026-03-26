package com.jsegomez.movies.persistence;

import com.jsegomez.movies.persistence.entities.MovieEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import com.jsegomez.movies.domain.dto.MovieDto;
import com.jsegomez.movies.domain.repository.MovieRepository;

import com.jsegomez.movies.persistence.crud.CrudMovieEntity;
import com.jsegomez.movies.persistence.mapper.MovieMapper;

@Repository
public class MovieEntityRepository implements MovieRepository {
    private final CrudMovieEntity crudMovieEntity;
    private final MovieMapper movieMapper;

    public MovieEntityRepository(CrudMovieEntity crudMovieEntity, MovieMapper movieMapper) {
        this.crudMovieEntity = crudMovieEntity;
        this.movieMapper = movieMapper;
    }

    @Override
    public List<MovieDto> findAll() {
        return this.movieMapper.toDtoList(crudMovieEntity.findAll());
    }

    @Override
    public Optional<MovieDto> findById(long id) {
        return crudMovieEntity.findById(id).map(movieMapper::toDto);
    }

    @Override
    public MovieDto save(MovieDto movie) {
        MovieEntity movieEntity = this.movieMapper.toEntity(movie);
        return this.movieMapper.toDto(crudMovieEntity.save(movieEntity));
    }
}
