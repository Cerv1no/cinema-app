package com.cerv1no.movieReservation.movie_reservation.seat;

import lombok.Data;

@Data
public class CreateSeatRequest {
    private String seatNumber;
    private Long roomId;
}
