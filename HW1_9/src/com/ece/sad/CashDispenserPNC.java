package com.ece.sad;

public class CashDispenserPNC extends CashDispenser {
    public CashDispenserPNC(CashDispenseAPI cashDispenseAPI) {
        super(cashDispenseAPI);
    }


    @Override
    public void cashDispense() {
        cashDispenseAPI.cashDispense();
    }
}
