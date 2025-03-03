package com.cerv1no.movieReservation.movie_reservation.reservation;

import lombok.Data;

import java.util.List;

@Data
public class CreateReservationRequest {
    private Long userId;
    private Long showtimeId;
    private List<Long> seatIds;
}
