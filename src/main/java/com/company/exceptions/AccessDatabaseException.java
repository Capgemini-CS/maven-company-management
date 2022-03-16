package com.company.exceptions;

public class AccessDatabaseException extends Exception{

    public AccessDatabaseException(String message){
        super("Can not access database.");
    }
}
