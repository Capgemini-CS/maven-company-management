package com.company.service;

import com.company.domain.Customer;
import com.company.exceptions.AccessDatabaseException;
import com.company.exceptions.DeleteValueException;
import com.company.exceptions.InsertValueException;
import com.company.repository.RepositoryInterface;
import com.company.service.dto.CustomerDto;
import com.company.service.mapper.CustomerMapper;
import org.tinylog.Logger;

import java.util.List;
import java.util.stream.Collectors;


public class CustomerService {

   RepositoryInterface<Customer> customerRepository;

    public CustomerService(RepositoryInterface<Customer> customerRepository){
        this.customerRepository = customerRepository;
    }

    public List<CustomerDto> getAllCustomers() throws AccessDatabaseException {
        try {
            return customerRepository.getAll()
                    .stream()
                    .map(CustomerMapper::customerToCustomerDto)
                    .collect(Collectors.toList());
        } catch (AccessDatabaseException e) {
            Logger.error("Could not access database.");
            throw new AccessDatabaseException("Could not access database.");
        }
    }

    public void addCustomerToTable(CustomerDto customerDto) throws InsertValueException {
        try {
            customerRepository.add(CustomerMapper.customerDtoToCustomer(customerDto));
            Logger.info("Customer id {} added to database.",
                    CustomerMapper.customerDtoToCustomer(customerDto).getCustomerNumber());
        } catch (InsertValueException e) {
            Logger.error("Could not insert customer in the database.");
            throw new InsertValueException("Could not insert customer in the database.");
        }
    }
    public void deleteCustomerById(int id) throws DeleteValueException {
        try {
            customerRepository.deleteById(id);
            Logger.info("Customer id {} deleted from database. ", id);
        } catch (DeleteValueException e) {
            Logger.error("Could not delete customer from the database.");
            throw new DeleteValueException("Could not delete customer from the database.");
        }
    }


    }






