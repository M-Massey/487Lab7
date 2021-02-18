package com.example.soap.service;

public class Address {
    public Address() {
        this.buildingAndStreet = "";
        this.city = "";
        this.zip = "";
    }

    public Address(String buildingAndStreet, String city, String zip) {
        this.buildingAndStreet = buildingAndStreet;
        this.city = city;
        this.zip = zip;
    }

    private String buildingAndStreet;
    private String city;
    private String zip;

    public String getBuildingAndStreet() {
        return buildingAndStreet;
    }

    public void setBuildingAndStreet(String buildingAndStreet) {
        this.buildingAndStreet = buildingAndStreet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
