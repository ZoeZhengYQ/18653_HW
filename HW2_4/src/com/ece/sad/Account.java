package com.ece.sad;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void updateBalance(double offset) {
        this.balance += offset;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }
}
