package com.ece.sad;

public class Balance implements ATMComponent {

    @Override
    public void provideService(Account fromAcc, Account toAcc, double amount) {
        System.out.println("Account name: " + fromAcc.getName() + " Current Balance: " + fromAcc.getBalance());
    }
}
