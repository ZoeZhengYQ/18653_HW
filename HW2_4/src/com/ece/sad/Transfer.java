package com.ece.sad;

public class Transfer implements ATMComponent {

    @Override
    public void provideService(Account fromAcc, Account toAcc, double amount) {
        if (fromAcc.getBalance() < amount) {
            System.out.println("No enough Balance!");
            return;
        }
        System.out.println("Transfer " + amount + " from " + fromAcc.getName() + " to " + toAcc.getName() + "...");
        fromAcc.updateBalance(-amount);
        toAcc.updateBalance(amount);
    }
}
