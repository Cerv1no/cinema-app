package com.cerv1no.movieReservation.movie_reservation.user;

import com.cerv1no.movieReservation.movie_reservation.reservation.ReservationMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = ReservationMapper.class)
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "reservations", ignore = true)
    User createUserRequestToUser(CreateUserRequest user);

    @Mapping(source = "reservations", target = "reservations")
    UserResponse userToUserResponse(User user);
}
