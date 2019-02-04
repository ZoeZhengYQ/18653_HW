package com.ece.sad;

public abstract class CashDispenser {
    protected CashDispenseAPI cashDispenseAPI;

    protected CashDispenser(CashDispenseAPI cashDispenseAPI) {
        this.cashDispenseAPI = cashDispenseAPI;
    }

    public abstract void cashDispense();
}
