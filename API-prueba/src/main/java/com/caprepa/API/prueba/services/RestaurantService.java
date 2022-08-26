package com.caprepa.API.prueba.services;

import com.caprepa.API.prueba.exceptions.BookingException;
import com.caprepa.API.prueba.jsons.RestaurantRest;

import java.util.List;

public interface RestaurantService {

    RestaurantRest getRestaurantById (Long restaurantID) throws BookingException;

    public List<RestaurantRest> getRestaurants() throws BookingException;
}
