package com.ece.sad;

public class NormalCustomer implements Customer {
    @Override
    public void accept(Taxi taxi) {
        taxi.visit(this);
    }
}
