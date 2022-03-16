package com.company.domain;

public class Customer {

    private long customerNumber;
    private String customerName;
    private String contactLastName;
    private String contactFirstName;
    private String phoneNumber;
    private String firstAddressLine;
    private String secondAddressLine;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private long salesRepEmployeeNumber;
    private float creditLimit;

    public Customer(long customerNumber, String customerName, String contactLastName, String contactFirstName, String phoneNumber, String firstAddressLine, String secondAddressLine, String city, String state, String postalCode, String country, long salesRepEmployeeNumber, float creditLimit) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.contactLastName = contactLastName;
        this.contactFirstName = contactFirstName;
        this.phoneNumber = phoneNumber;
        this.firstAddressLine = firstAddressLine;
        this.secondAddressLine = secondAddressLine;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
        this.creditLimit = creditLimit;
    }

    public Customer(){

    }

    public long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(long customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstAddressLine() {
        return firstAddressLine;
    }

    public void setFirstAddressLine(String firstAddressLine) {
        this.firstAddressLine = firstAddressLine;
    }

    public String getSecondAddressLine() {
        return secondAddressLine;
    }

    public void setSecondAddressLine(String secondAddressLine) {
        this.secondAddressLine = secondAddressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getSalesRepEmployeeNumber() {
        return salesRepEmployeeNumber;
    }

    public void setSalesRepEmployeeNumber(long salesRepEmployeeNumber) {
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", customerName='" + customerName + '\'' +
                ", contactLastName='" + contactLastName + '\'' +
                ", contactFirstName='" + contactFirstName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", firstAddressLine='" + firstAddressLine + '\'' +
                ", secondAddressLine='" + secondAddressLine + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", salesRepEmployeeNumber=" + salesRepEmployeeNumber +
                ", creditLimit=" + creditLimit +
                '}';
    }
}


