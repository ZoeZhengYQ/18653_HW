package com.ece.sad;

public class TaxiReservation extends Reservation {
    @Override
    public Hotel getHotel(String hotel){
        return null;
    }

    @Override
    public Airline getAirline(String airline) {
        return null;
    }

    @Override
    public Taxi getTaxi(String taxi) {

        if (taxi == null) return null;

        if (taxi.equalsIgnoreCase("lyft"))
            return new Lyft();
        else if (taxi.equalsIgnoreCase("uber"))
            return new Uber();

        return null;
    }
}
