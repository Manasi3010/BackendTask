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
@Table(name = "UserCompany")
public class UserCompnay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "lat")
    private String lat;
    @Column(name = "lng")
    private String lng;
    @Column(name = "postalCode")
    private String postalCode;
    @Column(name = "state")
    private String state;
    @Column(name = "department")
    private String department;
    @Column(name = "name")
    private String name;
    @Column(name = "title")
    private String title;

    @JsonIgnore
    @OneToOne(mappedBy = "uCompany", cascade = CascadeType.ALL)
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

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public UserCompnay() {
    }

    public UserCompnay(String address, String city, String lat, String lng, String postalCode, String state,
            String department, String name,
            String title) {
        this.address = address;
        this.city = city;
        this.lat = lat;
        this.lng = lng;
        this.postalCode = postalCode;
        this.state = state;
        this.department = department;
        this.name = name;
        this.title = title;

    }

    @Override
    public String toString() {
        return "UserCompnay [address=" + address + ", city=" + city + ", department=" + department + ", id=" + id
                + ", lat=" + lat + ", lng=" + lng + ", name=" + name + ", postalCode=" + postalCode + ", state=" + state
                + ", title=" + title + ", user=" + user + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
