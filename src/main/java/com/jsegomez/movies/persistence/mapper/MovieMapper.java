package com.jsegomez.movies.persistence.mapper;

import com.jsegomez.movies.domain.dto.MovieDto;
import com.jsegomez.movies.persistence.entities.MovieEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MovieMapper {
    @Mapping(target = "title",         source = "mvTitle")
    @Mapping(target = "duration",      source = "mvDuration")
    @Mapping(target = "genre",         source = "mvGenre")
    @Mapping(target = "classification", source = "mvClassification")
    @Mapping(target = "releaseDate",   source = "mvReleaseDate")
    @Mapping(target = "isAvailable",   source = "mvIsAvailable")
    MovieDto toDto(MovieEntity movieEntity);

    @Mapping(target = "mvTitle",         source = "title")
    @Mapping(target = "mvDuration",      source = "duration")
    @Mapping(target = "mvGenre",         source = "genre")
    @Mapping(target = "mvClassification", source = "classification")
    @Mapping(target = "mvReleaseDate",   source = "releaseDate")
    @Mapping(target = "mvIsAvailable",   source = "isAvailable")
    MovieEntity toEntity(MovieDto movieDto);

    List<MovieDto> toDtoList(Iterable<MovieEntity> movieEntities);
}
