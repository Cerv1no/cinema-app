package com.cerv1no.movieReservation.movie_reservation.showtime;

import com.cerv1no.movieReservation.movie_reservation.movie.MovieResponse;
import com.cerv1no.movieReservation.movie_reservation.room.RoomResponse;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ShowtimeResponse {
    private Long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private MovieResponse movie;
    private RoomResponse room;
}
