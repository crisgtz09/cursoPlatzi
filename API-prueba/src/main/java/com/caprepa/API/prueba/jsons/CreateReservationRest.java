package com.caprepa.API.prueba.jsons;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateReservationRest {

    @JsonProperty("date")
    private Date date;

    @JsonProperty("person")
    private String person;

    @JsonProperty("turnId")
    private String turnId;

    @JsonProperty("restaurantId")
    private Long restaurantid;

    public Date date() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String person() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String turnId() {
        return turnId;
    }

    public void setTurnId(String turnId) {
        this.turnId = turnId;
    }

    public Long restaurantid() {
        return restaurantid;
    }

    public void setRestaurantid(Long restaurantid) {
        this.restaurantid = restaurantid;
    }
}
