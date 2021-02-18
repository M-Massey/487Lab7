package com.example.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;

/**
 * This class holds the implementation of the methods of our SOAP web service
 */
@WebService(endpointInterface = "com.example.soap.service.Customer")
public class CustomerImpl implements Customer {
    private static ArrayList<CustomerPOJO> customerList = new ArrayList<CustomerPOJO>();
    /**
     * Prints a simple message with input from the client.
     * @param content
     * @return
     */
    @Override
    public String sayHelloWorld(String content) {
        return "Hello " + content + "!";
    }

    @Override
    public synchronized String update(int id, String field, String value) throws MissingId {
        CustomerPOJO result = this.customerList
                .stream()
                .filter(customer -> customer.getId()==id)
                .findAny()
                .orElse(null);
        if(result!=null) {
            if(field.equals("name")){

            }
            else if(field.equals("buildingAndStreet")){

            }
            else if(field.equals("city")){

            }
            else if(field.equals("zip")){

            }
        }
        else throw new MissingId();
    }

    @Override
    public synchronized String delete(int id) throws MissingId {
        CustomerPOJO result = this.customerList
                .stream()
                .filter(customer -> customer.getId()==id)
                .findAny()
                .orElse(null);
        if(result!=null) {

        }
        else throw new MissingId();
    }
}
