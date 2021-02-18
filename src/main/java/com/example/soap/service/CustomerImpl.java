package com.example.soap.service;

import javax.jws.WebService;

/**
 * This class holds the implementation of the methods of our SOAP web service
 */
@WebService(endpointInterface = "com.example.soap.service.Customer")
public class CustomerImpl implements Customer {
    private int id;
    private String name;
    private Address address;


    public CustomerImpl() {
        this.id = 0;
        this.name = "";
        this.address = new Address();
    }

    public CustomerImpl(int id, String name, Address address) {
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
    /**
     * Prints a simple message with input from the client.
     * @param content
     * @return
     */
    @Override
    public String sayHelloWorld(String content) {
        return "Hello " + content + "!";
    }
}
