package com.caprepa.API.prueba.services.impl;

import com.caprepa.API.prueba.entities.Reservation;
import com.caprepa.API.prueba.entities.Restaurant;
import com.caprepa.API.prueba.entities.Turn;
import com.caprepa.API.prueba.exceptions.BookingException;
import com.caprepa.API.prueba.exceptions.InternalServerErrorException;
import com.caprepa.API.prueba.exceptions.NotFoundException;
import com.caprepa.API.prueba.jsons.CreateReservationRest;
import com.caprepa.API.prueba.jsons.ReservationRest;
import com.caprepa.API.prueba.repositories.ReservationRepository;
import com.caprepa.API.prueba.repositories.RestaurantRepository;
import com.caprepa.API.prueba.repositories.TurnRepository;
import com.caprepa.API.prueba.services.ReservationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ReservationServiceImpl implements ReservationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReservationServiceImpl.class);

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private TurnRepository turnRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    public ReservationRest getReservation(Long reservationId) throws BookingException {
        return null;
    }
    public String createReservation(CreateReservationRest createReservationRest) throws BookingException {

        final Restaurant restaurantId = restaurantRepository.findById(createReservationRest.getRestaurantId())
                .orElseThrow(() -> new NotFoundException("RESTAURANT_NOT_FOUND", "RESTAURANT_NOT_FOUND"));

        final Turn turn = turnRepository.findById(createReservationRest.getTurnId())
                .orElseThrow(() -> new NotFoundException("TURN_NOT_FOUND", "TURN_NOT_FOUND"));

        String locator = gerateLocator(restaurantId, createReservationRest);

        final Reservation reservation = new Reservation();
        reservation.setLocator(locator);
        reservation.setPerson(createReservationRest.getPerson());
        reservation.setDate(createReservationRest.getDate());
        reservation.setRestaurant(createReservationRest.getId());
        reservation.setTurn(turn.getName());

        try {
            reservationRepository.save(reservation);
        }catch (final Exception e) {
            LOGGER.error("INTERNAL_SERVER_ERROR");
            throw new InternalServerErrorException("INTERNAL_SERVER_ERROR","INTERNAL_SERVER_ERROR");

        }

        return locator;
    }

    private String gerateLocator(Restaurant restaurantId, CreateReservationRest createReservationRest)
            throws BookingException{
        return restaurantId.getName() + createReservationRest.getTurnId();
    }

}
