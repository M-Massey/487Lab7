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
    @WebMethod
    public String sayHelloWorld(String content);

    @WebMethod(operationName = "update")
    public String update(@WebParam(name = "id") int id, @WebParam(name = "field") String field, @WebParam(name = "value") String value) throws MissingId;

    @WebMethod(operationName = "delete")
    public String delete(@WebParam(name = "id") int id) throws MissingId;
}
