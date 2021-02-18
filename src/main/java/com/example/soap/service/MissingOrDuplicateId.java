package com.example.soap.service;

import javax.xml.ws.WebFault;
import java.lang.Exception;

@WebFault(name="MissingOrDuplicateId", targetNamespace = "http://www.example.soap.com/service")
public class MissingOrDuplicateId extends Exception{
    public MissingOrDuplicateId(){
        super("Missing or duplicateId");
    }
}
