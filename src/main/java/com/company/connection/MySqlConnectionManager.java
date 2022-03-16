package com.company.connection;

import org.tinylog.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySqlConnectionManager implements ConnectionManager{
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/classicmodels";
    private String root = "root";
    private String password = "admin";

    @Override
    public Connection getConnection() {
       try{
           connection = DriverManager.getConnection(url, root, password);
           Logger.info("Connection successful.");
       }catch (SQLException e){
           Logger.error("Connection to the database failed.");
       }
        return this.connection;
    }


}
