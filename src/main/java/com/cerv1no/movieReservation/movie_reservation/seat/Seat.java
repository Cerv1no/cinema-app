package com.cerv1no.movieReservation.movie_reservation.seat;

import com.cerv1no.movieReservation.movie_reservation.reservation.Reservation;
import com.cerv1no.movieReservation.movie_reservation.room.Room;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String seatNumber;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToMany(mappedBy = "seats")
    private List<Reservation> reservations;
}
