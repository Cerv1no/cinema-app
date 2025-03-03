package com.cerv1no.movieReservation.movie_reservation.genre;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GenreMapper {
    GenreResponse genreToGenreResponse(Genre genre);

    @Mapping(target = "id", ignore = true) // ID is auto-generated
    Genre createGenreRequestToGenre(CreateGenreRequest request);
}
