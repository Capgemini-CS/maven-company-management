package com.company.service.mapper;

import com.company.domain.Customer;
import com.company.service.dto.CustomerDto;

public class CustomerMapper {

    public static CustomerDto customerToCustomerDto(Customer customer){
        CustomerDto customerDto = new CustomerDto();
        customerDto.setCustomerNumber(customer.getCustomerNumber());
        customerDto.setCustomerName(customer.getCustomerName());
        customerDto.setContactLastName(customer.getContactLastName());
        customerDto.setContactFirstName(customer.getContactFirstName());
        customerDto.setPhoneNumber(customer.getPhoneNumber());
        customerDto.setFirstAddressLine(customer.getPhoneNumber());
        customerDto.setSecondAddressLine(customer.getSecondAddressLine());
        customerDto.setCity(customer.getCity());
        customerDto.setState(customer.getState());
        customerDto.setPostalCode(customer.getPostalCode());
        customerDto.setCountry(customer.getCountry());
        customerDto.setSalesRepEmployeeNumber(customer.getSalesRepEmployeeNumber());
        customerDto.setCreditLimit(customer.getCreditLimit());
        return customerDto;
    }

    public static Customer customerDtoToCustomer(CustomerDto customerDto){
        Customer customer = new Customer();
        customer.setCustomerNumber(customerDto.getCustomerNumber());
        customer.setCustomerName(customerDto.getCustomerName());
        customer.setContactLastName(customerDto.getContactLastName());
        customer.setContactFirstName(customerDto.getContactFirstName());
        customer.setPhoneNumber(customerDto.getPhoneNumber());
        customer.setFirstAddressLine(customerDto.getPhoneNumber());
        customer.setSecondAddressLine(customerDto.getSecondAddressLine());
        customer.setCity(customerDto.getCity());
        customer.setState(customerDto.getState());
        customer.setPostalCode(customerDto.getPostalCode());
        customer.setCountry(customerDto.getCountry());
        customer.setSalesRepEmployeeNumber(customerDto.getSalesRepEmployeeNumber());
        customer.setCreditLimit(customerDto.getCreditLimit());
        return customer;
    }

}
