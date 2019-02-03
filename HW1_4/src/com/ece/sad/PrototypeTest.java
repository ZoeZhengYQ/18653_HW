package com.ece.sad;

public class PrototypeTest {
    public static void main(String[] args) {
        Prototype record = new CustomerRecord();
        ((CustomerRecord) record).loadAccountFromDatabase();
        System.out.println("Original Customer Record");
        ((CustomerRecord) record).printRecord();

        System.out.println("_______________________________");

        Prototype newRecord = record.getClone();
        System.out.println("Cloned Customer Record");
        ((CustomerRecord) newRecord).printRecord();

        System.out.println("_______________________________");
        ((CustomerRecord) newRecord).add(new BankAccount("Janice", "saving", "0721"));
        System.out.println("Modified cloned Customer Record");
        ((CustomerRecord) newRecord).printRecord();

    }
}
