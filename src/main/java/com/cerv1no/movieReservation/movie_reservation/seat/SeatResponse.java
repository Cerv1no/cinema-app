package com.cerv1no.movieReservation.movie_reservation.seat;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SeatResponse {
    private Long id;
    private String seatNumber;
    private Long roomId;
}
