package com.company.exceptions;

public class DeleteValueException extends Exception{

    public DeleteValueException(String message){
        super("Could not delete data from table.");
    }
}
