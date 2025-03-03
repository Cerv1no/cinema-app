package com.cerv1no.movieReservation.movie_reservation.user;

import com.cerv1no.movieReservation.movie_reservation.reservation.ReservationResponse;
import lombok.Data;

import java.util.List;

@Data
public class UserResponse {
    private Long id;
    private String username;
    private String email;
    private List<ReservationResponse> reservations;
}
