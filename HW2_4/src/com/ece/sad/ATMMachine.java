package com.ece.sad;

public class ATMMachine {
    private Balance balance;
    private CashDeposit deposit;
    private CashWithdraw withdraw;
    private Transfer transfer;

    public ATMMachine() {
        balance = new Balance();
        deposit = new CashDeposit();
        withdraw = new CashWithdraw();
        transfer = new Transfer();
    }

    public void inquiryBalance(Account acc) {
        balance.provideService(acc, null, 0);
    }

    public void requestDeposit(Account acc, double amount) {
        deposit.provideService(acc, null, amount);
        inquiryBalance(acc);
    }

    public void requestWithdraw(Account acc, double amount) {
        withdraw.provideService(acc, null, amount);
        inquiryBalance(acc);
    }

    public void requestTransfer(Account fromAcc, Account toAcc, double amount) {
        transfer.provideService(fromAcc, toAcc, amount);
        inquiryBalance(fromAcc);
        inquiryBalance(toAcc);
    }
}
