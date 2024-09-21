package com.studentcrud.springbootstudentcrud.entity;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String street;
    private String city;
    private String state;
    private String zipcode;

    @OneToOne(mappedBy = "address")
    private Student student;
    // Constructors, Getters, and Setters
    public Address(){

    }

    public Address(String zipcode, String state, String city, String street) {
        this.zipcode = zipcode;
        this.state = state;
        this.city = city;
        this.street = street;
    }
    // Getters and Setters

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
