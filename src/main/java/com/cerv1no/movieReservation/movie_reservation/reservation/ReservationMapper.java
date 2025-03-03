package com.cerv1no.movieReservation.movie_reservation.reservation;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservationMapper {

    ReservationResponse reservationToReservationResponse(Reservation reservation);

    List<ReservationResponse> reservationsToReservationResponses(List<Reservation> reservations);
}
