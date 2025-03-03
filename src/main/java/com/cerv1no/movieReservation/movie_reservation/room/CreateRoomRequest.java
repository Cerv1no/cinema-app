package com.cerv1no.movieReservation.movie_reservation.room;

import lombok.Data;

import java.util.List;

@Data
public class CreateRoomRequest {
    private String name;
    private List<Long> seatIds;
}
