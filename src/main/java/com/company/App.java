package com.company;

import com.company.domain.Customer;
import com.company.exceptions.AccessDatabaseException;
import com.company.repository.CustomerRepository;
import com.company.repository.RepositoryInterface;
import com.company.service.CustomerService;
import com.company.service.dto.CustomerDto;
import org.tinylog.Logger;

import java.util.List;

public class App {

    public static void main( String[] args )
    {

        RepositoryInterface<Customer> customerRepository = new CustomerRepository();
        CustomerService customerService = new CustomerService(customerRepository);

        try {
            List<CustomerDto> customers = customerService.getAllCustomers();
            System.out.println(customers.size());
        } catch (AccessDatabaseException e) {
            Logger.error("Could not access database.");
        }

        Customer customer = new Customer(497, "Capgemini", "Badea", "Andreea", "+40703432201",
                "Splaiul Independentei", "Str. Manastirii",
                "Bucharest", null, "245800", "Romania", 1370, 25000);
        //customerService.addCustomerToTable(customer);

        // customerService.deleteCustomerById(496);

    }
}
