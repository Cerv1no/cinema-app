package com.cerv1no.movieReservation.movie_reservation.seat;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SeatMapper {

    @Mapping(target = "id", ignore = true)
    public Seat createSeatRequestToSeat(CreateSeatRequest request);

    @Mapping(source = "room.id", target = "roomId")
    public SeatResponse seatToSeatResponse(Seat seat);
}
