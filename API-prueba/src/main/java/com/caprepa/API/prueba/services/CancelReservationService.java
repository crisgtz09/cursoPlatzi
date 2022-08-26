package com.caprepa.API.prueba.services;

import com.caprepa.API.prueba.exceptions.BookingException;

public interface CancelReservationService implements Cancel{

    public String deleteReservation(String locator) throws BookingException;

}
