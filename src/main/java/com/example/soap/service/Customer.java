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
    public Customer getCustomer(@WebParam(name="ID") String ID) throws MissingId;

    @WebMethod(operationName = "addCustomer")
    public void addCustomer(@WebParam(name="ID") int ID, @WebParam(name="name"))


    @WebMethod
    String sayHelloWorld(String content);
}
