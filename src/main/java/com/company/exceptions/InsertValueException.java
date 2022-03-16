package com.company.exceptions;

public class InsertValueException extends Exception{

    public InsertValueException(String message){
        super("Could not insert value in the database.");
    }
}
