package com.ece.sad;

public class Lyft implements Taxi {
    @Override
    public void getTaxiReservation() {
        System.out.println("Taxi: getting Lyft reservation...");
    }
}
