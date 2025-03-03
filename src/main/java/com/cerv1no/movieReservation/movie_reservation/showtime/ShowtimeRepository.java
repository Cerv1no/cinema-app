package com.cerv1no.movieReservation.movie_reservation.showtime;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowtimeRepository extends JpaRepository<Showtime, Long> {
    List<Showtime> findByRoomId(Long roomId);

    List<Showtime> findByMovieId(Long movieId);
}
