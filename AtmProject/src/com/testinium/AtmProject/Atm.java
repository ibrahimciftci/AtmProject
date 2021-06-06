package com.testinium.AtmProject;

public class Atm implements AtmManager{
    Customer customer;

    public Atm(Customer customer) {
        this.customer = customer;
    }

    @Override
    public double paraCek(Customer customer, double amount) {
        return customer.getAccountBalance()-amount;
    }

    @Override
    public double paraYatir(Customer customer, double amount) {
        return customer.getAccountBalance()+100;
    }
}
