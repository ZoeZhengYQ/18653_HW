package com.ece.sad;

public class Uber implements Taxi{
    @Override
    public void visit(NormalCustomer normalCustomer) {
        System.out.println("Uber visit normal customer.");
    }

    @Override
    public void visit(DisabilityCustomer disabilityCustomer) {
        System.out.println("Uber visit customer with diability, turn on access mode.");
    }

    @Override
    public void visit(CabCompany cabCompany) {
        System.out.println("Uber visit cab company dispatcher.");
    }
}
