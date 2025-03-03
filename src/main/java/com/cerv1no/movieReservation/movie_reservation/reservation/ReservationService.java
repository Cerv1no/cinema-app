package com.cerv1no.movieReservation.movie_reservation.reservation;

import com.cerv1no.movieReservation.movie_reservation.exception.ResourceNotFoundException;
import com.cerv1no.movieReservation.movie_reservation.seat.Seat;
import com.cerv1no.movieReservation.movie_reservation.seat.SeatRepository;
import com.cerv1no.movieReservation.movie_reservation.showtime.Showtime;
import com.cerv1no.movieReservation.movie_reservation.showtime.ShowtimeRepository;
import com.cerv1no.movieReservation.movie_reservation.user.User;
import com.cerv1no.movieReservation.movie_reservation.user.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;
    private final UserRepository userRepository;
    private final ShowtimeRepository showtimeRepository;
    private final SeatRepository seatRepository;

    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reservation", id));
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Transactional
    public Reservation createReservation(Long userId, Long showtimeId, List<Long> seatIds) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User", userId));

        Showtime showtime = showtimeRepository.findById(showtimeId)
                .orElseThrow(() -> new ResourceNotFoundException("Showtime", showtimeId));

        List<Seat> seats = seatRepository.findAllById(seatIds);
        if (seats.size() != seatIds.size()) {
            throw new IllegalArgumentException("One or more seats not found");
        }

        Reservation reservation = new Reservation();
        reservation.setReservationDate(LocalDateTime.now());
        reservation.setUser(user);
        reservation.setShowtime(showtime);
        reservation.setSeats(seats);

        return reservationRepository.save(reservation);
    }

    @Transactional
    public Reservation updateReservation(Long id, List<Long> newSeatIds) {
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reservation", id));

        List<Seat> newSeats = seatRepository.findAllById(newSeatIds);
        if (newSeats.size() != newSeatIds.size()) {
            throw new IllegalArgumentException("One or more seats not found");
        }

        reservation.setSeats(newSeats);
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(Long id) {
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reservation", id));
        reservationRepository.delete(reservation);
    }

    public List<Reservation> getUserReservations(Long id) {
        return reservationRepository.findByUserId(id);
    }
}
