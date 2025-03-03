package com.cerv1no.movieReservation.movie_reservation.room;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoomMapper {

    Room createRoomRequestToRoom(CreateRoomRequest room);

    RoomResponse roomToRoomResponse(Room room);
}
