package com.ece.sad;

public class DisabilityCustomer implements Customer{
    @Override
    public void accept(Taxi taxi) {
        taxi.visit(this);
    }
}
