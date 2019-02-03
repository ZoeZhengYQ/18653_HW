package com.ece.sad;

public class BankAccount{
    private final String accountNum;
    private final String accountType;
    private final String accountHolder;

    public BankAccount(String accountHolder, String accountType, String accountNum) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.accountNum = accountNum;
    }

    public void printAccountInfo() {
        System.out.println(accountHolder + " " + accountNum + " " + accountType);
    }
}
