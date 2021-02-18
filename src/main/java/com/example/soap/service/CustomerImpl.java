package com.example.soap.service;

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
    public synchronized String update(int id, String field, String value) throws MissingOrDuplicateId {
        CustomerPOJO result = this.customerList
                .stream()
                .filter(customer -> customer.getId()==id)
                .findAny()
                .orElse(null);
        if(result!=null) {
            if(field.equals("name")){
                result.setName(value);
                return "Customer with id "+result.getId()+ " updated the name to "+result.getName();
            }
            else if(field.equals("buildingAndStreet")){
                Address temp = result.getAddress();
                temp.setBuildingAndStreet(value);
                result.setAddress(new Address());
            }
            else if(field.equals("city")){
                Address temp = result.getAddress();
                temp.setCity(value);
                result.setAddress(new Address());
            }
            else if(field.equals("zip")){
                Address temp = result.getAddress();
                temp.setZip(value);
                result.setAddress(new Address());
            }
            else {
                return "that field does not exist";
            }
            return "Customer with id "+result.getId()+ " has updated "+field+ " to "+value;
        }
        else throw new MissingOrDuplicateId();
    }

  \

    /**
     * Prints a simple message with input from the client.
     * @param content
     * @return
     */

    @Override
    public synchronized CustomerPOJO getCustomer(int id) throws MissingOrDuplicateId {
        CustomerPOJO result = this.customerList
                .stream()
                .filter(customer -> customer.getId()== id)
                .findAny()
                .orElse(null);
        if(result == null) {
            throw new MissingOrDuplicateId();
        }
        else{
            return result;
        }
    }

    @Override
    public synchronized void addCustomer(int id, String name, String buildingAndStreet, String city, String zip) throws MissingOrDuplicateId {
        CustomerPOJO result = this.customerList
                .stream()
                .filter(customer -> customer.getId()==id)
                .findAny()
                .orElse(null);
        if(result!=null) {
            throw new MissingOrDuplicateId();
        }
        else{
            customerList.add(new CustomerPOJO(id, name, new Address(buildingAndStreet, city, zip)));
        }
    }
    @Override
    public synchronized String delete(int id) throws MissingOrDuplicateId {
        CustomerPOJO result = this.customerList
                .stream()
                .filter(customer -> customer.getId()==id)
                .findAny()
                .orElse(null);
        if(result!=null) {
            return "Customer with id "+result.getId()+ " deleted";
        }
        else throw new MissingOrDuplicateId();
    }
}
