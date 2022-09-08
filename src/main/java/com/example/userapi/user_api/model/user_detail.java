package com.example.userapi.user_api.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user_detail")
public class user_detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @JsonIgnore
    @OneToOne(mappedBy = "uDetail", cascade = CascadeType.ALL)
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public user_detail() {
    }

    public user_detail(String address, String city, String state) {
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public user_detail(int id, String address, String city, String state) {
        this.id = id;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "user_detail [address=" + address + ", city=" + city + ", id=" + id + ", state=" + state + "]";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
