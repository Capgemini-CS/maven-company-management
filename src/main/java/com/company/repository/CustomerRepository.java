package com.company.repository;

import com.company.connection.ConnectionManager;
import com.company.connection.MySqlConnectionManager;
import com.company.domain.Customer;
import com.company.exceptions.AccessDatabaseException;
import com.company.exceptions.DeleteValueException;
import com.company.exceptions.InsertValueException;
import org.tinylog.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements RepositoryInterface<Customer>{

    private ConnectionManager sqlConnection = new MySqlConnectionManager();


    @Override
    public void add(Customer customer) throws InsertValueException {
        String addCustomerQuery = "INSERT INTO customers " +
                " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try(Connection connection = sqlConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(addCustomerQuery);
        ){
            preparedStatement.setLong(1, customer.getCustomerNumber());
            preparedStatement.setString(2, customer.getCustomerName());
            System.out.println(customer.getCustomerName());
            preparedStatement.setString(3, customer.getContactLastName());
            System.out.println(customer.getContactLastName());
            preparedStatement.setString(4, customer.getContactFirstName());
            preparedStatement.setString(5, customer.getPhoneNumber());
            preparedStatement.setString(6, customer.getFirstAddressLine());
            preparedStatement.setString(7, customer.getSecondAddressLine());
            preparedStatement.setString(8, customer.getCity());
            preparedStatement.setString(9, customer.getState());
            preparedStatement.setString(10, customer.getPostalCode());
            preparedStatement.setString(11, customer.getCountry());
            preparedStatement.setLong(12, customer.getSalesRepEmployeeNumber());
            preparedStatement.setFloat(13, customer.getCreditLimit());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.error("Adding new customer in database failed.", e);
            throw new InsertValueException("Could not insert value in database.");
        }
    }

    @Override
    public List<Customer> getAll() throws AccessDatabaseException {
       List<Customer> customers = new ArrayList<Customer>();
       String selectAllFromTable = "SELECT * FROM customers";

       try(Connection connection = sqlConnection.getConnection();
           PreparedStatement preparedStatement = connection.prepareStatement(selectAllFromTable);
           ResultSet resultSet = preparedStatement.executeQuery()
       ){
           while(resultSet.next()){
                Customer customer = new Customer();
                customer.setCustomerNumber(resultSet.getInt("customerNumber"));
                customer.setCustomerName(resultSet.getString("customerName"));
                customer.setContactLastName(resultSet.getString("contactLastName"));
                customer.setContactFirstName(resultSet.getString("contactFirstName"));
                customer.setPhoneNumber(resultSet.getString("phone"));
                customer.setFirstAddressLine(resultSet.getString("addressLine1"));
                customer.setSecondAddressLine(resultSet.getString("addressLine2"));
                customer.setCity(resultSet.getString("city"));
                customer.setState(resultSet.getString("state"));
                customer.setPostalCode(resultSet.getString("postalCode"));
                customer.setCountry(resultSet.getString("country"));
                customer.setSalesRepEmployeeNumber(resultSet.getInt("salesRepEmployeeNumber"));
                customer.setCreditLimit(resultSet.getLong("creditLimit"));
                customers.add(customer);
           }
       } catch (SQLException e) {
           Logger.error(e.getMessage());
           throw new AccessDatabaseException("Could not access database.");
       }
       return customers;
    }

    @Override
    public void deleteById(long customerNumber) throws DeleteValueException {
        String deleteFromTable = "DELETE FROM customers WHERE customerNumber = ?";
        try(Connection connection = sqlConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(deleteFromTable)
        ) {
            preparedStatement.setLong(1, customerNumber);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.error("Could not delete data from table.");
            throw new DeleteValueException("Could not delete data from table.");
        }
    }


//    public void addCustomerWithTransaction(Customer customer, Connection connection) throws SQLException {
//        if(connection == null) {
//            connection = sqlConnection.getConnection();
//        }
//
//
//    }


}
