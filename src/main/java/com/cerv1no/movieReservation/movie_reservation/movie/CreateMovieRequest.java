package com.cerv1no.movieReservation.movie_reservation.movie;

import lombok.Data;

@Data
public class CreateMovieRequest {
    private String title;
    private String description;
    private String imageUrl;
    private Long genreId;
}
