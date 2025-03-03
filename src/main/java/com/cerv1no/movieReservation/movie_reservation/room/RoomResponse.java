package com.cerv1no.movieReservation.movie_reservation.room;

import com.cerv1no.movieReservation.movie_reservation.seat.SeatResponse;
import com.cerv1no.movieReservation.movie_reservation.showtime.ShowtimeResponse;
import lombok.Data;

import java.util.List;

@Data
public class RoomResponse {
    private Long id;
    private String name;
    private List<SeatResponse> seats;
    private List<ShowtimeResponse> showtimes;
}
