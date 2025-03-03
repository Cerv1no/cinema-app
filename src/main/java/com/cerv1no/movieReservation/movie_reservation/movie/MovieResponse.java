package com.cerv1no.movieReservation.movie_reservation.movie;

import com.cerv1no.movieReservation.movie_reservation.genre.GenreResponse;
import lombok.Data;

@Data
public class MovieResponse {
    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private GenreResponse genre;
}
