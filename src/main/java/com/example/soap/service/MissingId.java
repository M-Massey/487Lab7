package com.example.soap.service;

import javax.xml.ws.WebFault;
import java.lang.Exception;

@WebFault(name="MissingId", targetNamespace = "http://www.example.soap.com/service")
public class MissingId extends Exception{
    public MissingId(){
        super("No matching id found");
    }
}
