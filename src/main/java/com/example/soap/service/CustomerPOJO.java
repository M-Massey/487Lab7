package com.example.soap.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerPOJO {
    private int id;
    private String name;
    private Address address;


    public CustomerPOJO() {
        this.id = 0;
        this.name = "";
        this.address = new Address();
    }

    public CustomerPOJO(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
