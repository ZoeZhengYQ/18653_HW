package com.ece.sad;

public class Uber implements Taxi {
    @Override
    public void getTaxiReservation() {
        System.out.println("Taxi: getting Uber reservation...");
    }
}
