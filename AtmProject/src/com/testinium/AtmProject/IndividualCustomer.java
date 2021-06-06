package com.testinium.AtmProject;

public class IndividualCustomer extends Customer{
    private String address;

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }
}
