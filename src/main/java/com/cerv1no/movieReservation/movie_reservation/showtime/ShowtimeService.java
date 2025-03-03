package com.cerv1no.movieReservation.movie_reservation.showtime;

import com.cerv1no.movieReservation.movie_reservation.exception.ResourceNotFoundException;
import com.cerv1no.movieReservation.movie_reservation.movie.MovieRepository;
import com.cerv1no.movieReservation.movie_reservation.room.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ShowtimeService {

    private final ShowtimeRepository showtimeRepository;
    private final RoomRepository roomRepository;
    private final MovieRepository movieRepository;

    public Showtime getShowtimeById(Long id) {
        return showtimeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Showtime", id));
    }

    public List<Showtime> getAllShowtimes() {
        return showtimeRepository.findAll();
    }

    public List<Showtime> getShowtimesByRoomId(Long roomId) {
        return showtimeRepository.findByRoomId(roomId);
    }

    public List<Showtime> getShowtimesByMovieId(Long movieId) {
        return showtimeRepository.findByMovieId(movieId);
    }

    public Showtime createShowtime(Showtime showtime) {
        Showtime existingShowtime = showtimeRepository.findById(showtime.getId())
                .orElseThrow(() -> new IllegalArgumentException("Showtime already exists"));
        return showtimeRepository.save(existingShowtime);
    }

    public Showtime updateShowtime(Showtime showtime) {
        Showtime existingShowtime = showtimeRepository.findById(showtime.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Showtime", showtime.getId()));

        if (movieRepository.existsById(showtime.getMovie().getId()))
            existingShowtime.setMovie(showtime.getMovie());
        else
            throw new ResourceNotFoundException("Movie", showtime.getMovie().getId());

        if (roomRepository.existsById(showtime.getRoom().getId()))
            existingShowtime.setRoom(showtime.getRoom());
        else
            throw new ResourceNotFoundException("Room", showtime.getRoom().getId());

        existingShowtime.setStartTime(showtime.getStartTime());
        existingShowtime.setEndTime(showtime.getEndTime());
        return showtimeRepository.save(existingShowtime);
    }

    public void deleteShowtime(Long id) {
        if (!showtimeRepository.existsById(id)) {
            throw new ResourceNotFoundException("Showtime", id);
        }
        showtimeRepository.deleteById(id);
    }
}
