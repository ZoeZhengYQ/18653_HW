package com.ece.sad;

public class CashDeposit implements ATMComponent {

    @Override
    public void provideService(Account fromAcc, Account toAcc, double amount) {
        System.out.println("Deposit " + amount + " to account " + fromAcc.getName() + "...");
        fromAcc.updateBalance(amount);
    }
}
