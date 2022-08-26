package com.caprepa.API.prueba.entities;

import javax.persistence.*;
import javax.persistence.Column;
import java.util.List;


@Entity
@Table (name="RESTAURANT")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID", unique = true, nullable =true)
    private Long id;

    @Column(name= "NAME")
    private String name;

    @Column(name= "ADDRESS")
    private String address;

    @Column(name= "DESCRIPTION")
    private String description;

    @Column(name= "IMAGE")
    private String image;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY , mappedBy = "restaurant")
    private List<Reservation> reservations;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY , mappedBy = "restaurant")
    private List<Reservation> boards;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY , mappedBy = "restaurant")
    private List<Reservation> turns;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Reservation> getBoards() {
        return boards;
    }

    public void setBoards(List<Reservation> boards) {
        this.boards = boards;
    }

    public List<Reservation> getTurns() {
        return turns;
    }

    public void setTurns(List<Reservation> turns) {
        this.turns = turns;
    }
}
