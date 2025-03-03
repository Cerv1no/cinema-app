package com.cerv1no.movieReservation.movie_reservation.showtime;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateShowtimeRequest {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long movieId;
    private Long roomId;
}
