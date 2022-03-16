package com.company.service.dto;

import lombok.Getter;
import lombok.Setter;

public class CustomerDto {

    @Getter
    @Setter
    private long customerNumber;

    @Getter
    @Setter
    private String customerName;

    @Getter
    @Setter
    private String contactLastName;

    @Getter
    @Setter
    private String contactFirstName;

    @Getter
    @Setter
    private String phoneNumber;

    @Getter
    @Setter
    private String firstAddressLine;

    @Getter
    @Setter
    private String secondAddressLine;

    @Getter
    @Setter
    private String city;

    @Getter
    @Setter
    private String state;

    @Getter
    @Setter
    private String postalCode;

    @Getter
    @Setter
    private String country;

    @Getter
    @Setter
    private long salesRepEmployeeNumber;

    @Getter
    @Setter
    private float creditLimit;

}
