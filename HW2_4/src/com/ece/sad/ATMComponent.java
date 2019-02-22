package com.ece.sad;

public interface ATMComponent {
    void provideService(Account fromAcc, Account toAcc, double amount);
}
