package com.jsegomez.movies.persistence.crud;

import com.jsegomez.movies.persistence.entities.MovieEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudMovieEntity extends CrudRepository<MovieEntity, Long> {
}
