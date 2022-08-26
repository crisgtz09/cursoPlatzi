package com.caprepa.API.prueba.services.impl;

import com.caprepa.API.prueba.exceptions.BookingException;
import com.caprepa.API.prueba.services.CancelReservationService;
import org.springframework.beans.factory.annotation.Autowired;

public class CancelReservationServiceImpl implements CancelReservationService {

    @Autowired

    public String deleteReservation(String locator) throws BookingException {


        return null;
    }
}
