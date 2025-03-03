package com.cerv1no.movieReservation.movie_reservation.seat;

import com.cerv1no.movieReservation.movie_reservation.exception.ResourceNotFoundException;
import com.cerv1no.movieReservation.movie_reservation.room.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SeatService {

    private final SeatRepository seatRepository;
    private final RoomService roomService;

    public Seat getSeatById(Long id) {
        return seatRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Seat", id));
    }

    public List<Seat> getAllSeatsOfRoom(Long roomId) {
        return seatRepository.findAllByRoomId(roomId);
    }

    public Seat createSeat(Seat request) {
        return seatRepository.save(request);
    }

    public Seat updateSeat(Long id, Seat request) {
        Seat seat = seatRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Seat", id));
        seat.setSeatNumber(request.getSeatNumber());
        seat.setRoom(request.getRoom());
        return seatRepository.save(seat);
    }

    public void deleteSeat(Long id) {
        Seat seat = seatRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Seat", id));
        seatRepository.delete(seat);
    }
}
