package com.ece.sad;

public class Politician implements Jobs {
    @Override
    public void doJob() {
        System.out.println("take money from the rich, and take votes from the poor");
    }
}
