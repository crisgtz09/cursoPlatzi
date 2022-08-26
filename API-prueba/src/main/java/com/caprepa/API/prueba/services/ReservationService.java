package com.caprepa.API.prueba.services;

import com.caprepa.API.prueba.exceptions.BookingException;
import com.caprepa.API.prueba.jsons.ReservationRest;

public interface ReservationService {

    ReservationRest getReservation(Long reservationId) throws BookingException;
}
