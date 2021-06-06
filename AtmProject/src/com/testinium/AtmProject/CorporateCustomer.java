package com.testinium.AtmProject;

public class CorporateCustomer extends Customer{
    private String companyName;

    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
