package com.ece.sad;

public class CashWithdraw implements ATMComponent {

    @Override
    public void provideService(Account fromAcc, Account toAcc, double amount) {
        if (fromAcc.getBalance() < amount) {
            System.out.println("No enough balance!");
            return;
        }
        System.out.println("Withdrawing " + amount + " from account " + fromAcc.getName() + "...");
        fromAcc.updateBalance(-amount);
    }
}
