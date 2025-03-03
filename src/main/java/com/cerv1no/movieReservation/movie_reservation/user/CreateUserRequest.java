package com.cerv1no.movieReservation.movie_reservation.user;

import lombok.Data;

@Data
public class CreateUserRequest {
    private String username;
    private String password;
    private String email;
}
