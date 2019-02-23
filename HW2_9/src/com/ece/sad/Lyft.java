package com.ece.sad;

public class Lyft implements Taxi {
    @Override
    public void visit(NormalCustomer normalCustomer) {
        System.out.println("Lyft visit normal customer.");
    }

    @Override
    public void visit(DisabilityCustomer disabilityCustomer) {
        System.out.println("Lyft visit customer with diability, turn on access mode.");
    }

    @Override
    public void visit(CabCompany cabCompany) {
        System.out.println("Lyft visit cab company dispatcher.");
    }
}
