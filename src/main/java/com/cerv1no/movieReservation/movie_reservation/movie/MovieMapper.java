package com.cerv1no.movieReservation.movie_reservation.movie;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MovieMapper {

    @Mapping(source = "genre.id", target = "genre.id")
    @Mapping(source = "genre.name", target = "genre.name")
    MovieResponse movieToMovieResponse(Movie movie);

    @Mapping(source = "genreId", target = "genre.id")
    Movie createMovieRequestToMovie(CreateMovieRequest request);
}
