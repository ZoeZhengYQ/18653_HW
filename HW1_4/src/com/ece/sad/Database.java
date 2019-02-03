package com.ece.sad;

import java.util.List;

public class Database{
    private BankAccount Zoe;
    private BankAccount Leo;
    private BankAccount Maggie;
    private BankAccount Victoria;


    public Database() {
        this.Zoe = new BankAccount("Zoe", "checking", "0418");
        this.Leo = new BankAccount("Leo", "saving", "1110");
        this.Maggie = new BankAccount("Maggie", "checking", "0808");
        this.Victoria = new BankAccount("Victoria", "saving", "0523");
    }


    public BankAccount getZoe() {
        System.out.println("Getting zoe from database.");
        return Zoe;
    }

    public BankAccount getLeo() {
        System.out.println("Getting leo from database.");
        return Leo;
    }

    public BankAccount getMaggie() {
        System.out.println("Getting maggie from database.");
        return Maggie;
    }

    public BankAccount getVictoria() {
        System.out.println("Getting victoria from database.");
        return Victoria;
    }
}
