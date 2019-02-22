package com.ece.sad;

public class Main {

    public static void main(String[] args) {
	    Account account1 = new Account("Zoe", 1000);
	    Account account2 = new Account("Leo", 100);

	    ATMMachine machine = new ATMMachine();

	    System.out.println("Balance inquiry");
	    machine.inquiryBalance(account1);
		machine.inquiryBalance(account2);

		System.out.println("\nDeposit");
		machine.requestDeposit(account1, 500);
		machine.requestDeposit(account2, 88);

		System.out.println("\nWithdraw");
		machine.requestWithdraw(account1, 400);
		machine.requestWithdraw(account2, 66);

		System.out.println("\nTransfer");
		machine.requestTransfer(account1, account2, 800);

    }
}
