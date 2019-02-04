package com.ece.sad;

public class Main {

    public static void main(String[] args) {
	    CashDispenser dispense10 = new CashDispenserPNC(new Dispense10());
        CashDispenser dispense20 = new CashDispenserPNC(new Dispense20());

        dispense10.cashDispense();
        dispense20.cashDispense();
    }
}
