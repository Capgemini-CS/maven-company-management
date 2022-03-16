package com.company.exceptions;

public class InvalidUpdateException extends Exception{

    public InvalidUpdateException(String message){
        super("Invalid update.");

    }
}
