package com.testinium.AtmProject;

public class Customer {
    protected String identificationNumber;
    protected String firstName;
    protected String lastName;
    protected double accountBalance;
    private String companyName;
    private String address;

    public String getAddress() {
        return "Yok";
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyName() {
        return "Yok";
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
