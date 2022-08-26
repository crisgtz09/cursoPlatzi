package com.caprepa.API.prueba.services.impl;

import com.caprepa.API.prueba.entities.Restaurant;
import com.caprepa.API.prueba.exceptions.BookingException;
import com.caprepa.API.prueba.exceptions.NotFoundException;
import com.caprepa.API.prueba.jsons.RestaurantRest;
import com.caprepa.API.prueba.repositories.RestaurantRepository;
import com.caprepa.API.prueba.services.RestaurantService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;

    public static final ModelMapper modelMapper = new ModelMapper();

    public RestaurantRest getRestaurantById(Long restaurantID) throws BookingException {
        return modelMapper.map(getRestaurantEntity(restaurantID),RestaurantRest.class);
    }

    @Override
    public List<RestaurantRest> getRestaurants() throws BookingException {
        final List<Restaurant> restaurantEntity = restaurantRepository.findAll();
        return restaurantEntity.stream().map(service -> modelMapper.map(service, RestaurantRest.class)).collect(Collectors.toList());
    }

    private Restaurant getRestaurantEntity(Long restaurantId) throws BookingException {
        return restaurantRepository.findById(restaurantId).orElseThrow(() -> new NotFoundException("SNOT-404-1", "RESTAURANT_NOT_FOUND"));
    }
}
