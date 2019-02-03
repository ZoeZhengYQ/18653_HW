package com.ece.sad;

import java.util.ArrayList;
import java.util.List;

public class CustomerRecord implements Prototype{
    private List<BankAccount> accountCache;

    public CustomerRecord() {
        accountCache = new ArrayList<>();
    }

    public CustomerRecord(List<BankAccount> tmp) {
        accountCache = new ArrayList<>(tmp);
    }

    public void loadAccountFromDatabase() {
        System.out.println("Loading data from Database");
        Database data = new Database();
        accountCache.add(data.getZoe());
        accountCache.add(data.getLeo());
        accountCache.add(data.getMaggie());
        accountCache.add(data.getVictoria());
    }

    public void printRecord() {
        for (BankAccount acc : accountCache) {
            acc.printAccountInfo();
        }
    }

    public void add(BankAccount newAcc) {
        accountCache.add(newAcc);
    }

    @Override
    public Prototype getClone() {
        System.out.println("Getting clone...");
        List<BankAccount> tmpList = new ArrayList<>();
        for (BankAccount account : accountCache) {
            tmpList.add(account);
        }
        return new CustomerRecord(tmpList);
    }
}
