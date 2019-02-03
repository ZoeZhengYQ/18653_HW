package com.ece.sad;

public class AirlineReservation extends Reservation {
    @Override
    public Hotel getHotel(String hotel){
        return null;
    }

    @Override
    public Airline getAirline(String airline) {

        if (airline == null) return null;

        if (airline.equalsIgnoreCase("jetblue"))
            return new JetBlue();
        else if (airline.equalsIgnoreCase("delta"))
            return new Delta();

        return null;
    }

    @Override
    public Taxi getTaxi(String taxi) {
        return null;
    }
}
