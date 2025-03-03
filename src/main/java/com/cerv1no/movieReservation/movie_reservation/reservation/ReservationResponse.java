package com.cerv1no.movieReservation.movie_reservation.reservation;

import com.cerv1no.movieReservation.movie_reservation.seat.SeatResponse;
import com.cerv1no.movieReservation.movie_reservation.showtime.ShowtimeResponse;
import com.cerv1no.movieReservation.movie_reservation.user.UserResponse;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ReservationResponse {
    private Long id;
    private LocalDateTime reservationDate;
    private UserResponse user;
    private ShowtimeResponse showtime;
    private List<SeatResponse> seats;
}
