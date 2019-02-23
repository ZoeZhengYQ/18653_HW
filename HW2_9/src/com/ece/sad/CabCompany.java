package com.ece.sad;

public class CabCompany implements Customer {

    private Customer[] customerList = {new DisabilityCustomer(), new NormalCustomer()};

    @Override
    public void accept(Taxi taxi) {
        taxi.visit(this);
        for (Customer c : customerList) {
            c.accept(taxi);
        }
    }
}
