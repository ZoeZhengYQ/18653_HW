package com.ece.sad;

public class Main {

    public static void main(String[] args) {
        Customer cabCompany = new CabCompany();
        cabCompany.accept(new Lyft());

        System.out.println("");
        cabCompany.accept(new Uber());
    }
}
