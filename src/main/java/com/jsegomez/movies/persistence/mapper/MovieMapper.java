package com.jsegomez.movies.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.InheritInverseConfiguration;

import java.util.List;

import com.jsegomez.movies.domain.dto.MovieDto;
import com.jsegomez.movies.persistence.entities.MovieEntity;

@Mapper(componentModel = "spring")
public interface MovieMapper {
    @Mapping(target = "id",            source = "mvId")
    @Mapping(target = "title",         source = "mvTitle")
    @Mapping(target = "duration",      source = "mvDuration")
    @Mapping(target = "genre",         source = "mvGenre")
    @Mapping(target = "classification", source = "mvClassification")
    @Mapping(target = "releaseDate",   source = "mvReleaseDate")
    @Mapping(target = "isAvailable",   source = "mvIsAvailable")
    MovieDto toDto(MovieEntity movieEntity);

    @InheritInverseConfiguration
    MovieEntity toEntity(MovieDto movieDto);

    List<MovieDto> toDtoList(Iterable<MovieEntity> movieEntities);
}
