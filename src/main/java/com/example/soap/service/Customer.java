package com.example.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Interface for our Calculator web service
 */
@WebService
@SOAPBinding
public interface Customer {
    @WebMethod(operationName = "getCustomer")
    public Customer getCustomer(@WebParam(name="id") String id) throws MissingOrDuplicateId;

    @WebMethod(operationName = "addCustomer")
    public void addCustomer(@WebParam(name="id") int id, @WebParam(name="name") String name,
                            @WebParam(name="buildingAndStreet") String buildingAndStreet,
                            @WebParam(name="city") String city,
                            @WebParam(name="zip") String zip) throws MissingOrDuplicateId;


    @WebMethod
    public String sayHelloWorld(String content);

    @WebMethod(operationName = "update")
    public String update(@WebParam(name = "id") int id, @WebParam(name = "field") String field, @WebParam(name = "value") String value) throws MissingOrDuplicateId;

    @WebMethod(operationName = "delete")
    public String delete(@WebParam(name = "id") int id) throws MissingOrDuplicateId;
}
