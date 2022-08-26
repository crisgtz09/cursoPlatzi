package com.caprepa.API.prueba.entities;

import javax.persistence.*;

@Entity
@Table(name="RESERVATION")
public class Reservation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @Column( name = "LOCATOR")
    private String locator;

    @Column( name = "TURN")
    private String turn;

    @Column( name = "PERSON")
    private String person;

    @Column( name = "DATE")
    private String date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="RESTAURANT_ID", nullable = false)
    private Restaurant restaurant;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocator() {
        return locator;
    }

    public void setLocator(String locator) {
        this.locator = locator;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }
}