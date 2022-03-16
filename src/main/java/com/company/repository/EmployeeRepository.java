package com.company.repository;

import com.company.connection.ConnectionManager;
import com.company.connection.MySqlConnectionManager;
import com.company.domain.Employee;
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

public class EmployeeRepository implements RepositoryInterface<Employee>{

    ConnectionManager sqlConnection = new MySqlConnectionManager();

    @Override
    public List<Employee> getAll() throws AccessDatabaseException {
        List<Employee> employees = new ArrayList<Employee>();
        String selectAllFromTable = "SELECT * FROM employees";

        try(Connection connection = sqlConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(selectAllFromTable);
            ResultSet resultSet = preparedStatement.executeQuery()
        ){
            while(resultSet.next()){
                Employee employee = new Employee();
                employee.setEmployeeNumber(resultSet.getLong("employeeNumber"));
                employee.setLastName(resultSet.getString("lastName"));
                employee.setFirstName(resultSet.getString("firstName"));
                employee.setExtension(resultSet.getString("extension"));
                employee.setEmail(resultSet.getString("email"));
                employee.setOfficeCode(resultSet.getString("officeCode"));
                employee.setSupervisorNumber(resultSet.getLong("reportsTo"));
                employee.setJobTitle(resultSet.getString("jobTitle"));

                employees.add(employee);
            }
        } catch (SQLException e) {
            Logger.error(e.getMessage());
            throw new AccessDatabaseException("Could not access database.");
        }
        return employees;
    }

    @Override
    public void add(Employee dataType) throws InsertValueException {

    }

    @Override
    public void deleteById(long id) throws DeleteValueException {

    }


//    public void addEmployeeWithTransaction(Employee employee) {
//        String addEmployee = "INSERT INTO employee " + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
//        String addCustomer = "INSERT INTO customers " +
//                " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//
//        try(Connection connection = sqlConnection.getConnection();
//            PreparedStatement addEmployeeStatement = connection.prepareStatement(addEmployee);
//            PreparedStatement addCustomerStatement = connection.prepareStatement(addCustomer)) {
//
//            connection.setAutoCommit(false);
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}
