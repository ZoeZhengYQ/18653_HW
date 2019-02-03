package com.ece.sad;

public class HotelReservation extends Reservation {
    @Override
    public Hotel getHotel(String hotel){
        if (hotel == null) return null;

        if (hotel.equalsIgnoreCase("hilton"))
            return new Hilton();
        else if (hotel.equalsIgnoreCase("marriott"))
            return new Marriott();

        return null;
    }

    @Override
    public Airline getAirline(String airline) {
        return null;
    }

    @Override
    public Taxi getTaxi(String taxi) {
        return null;
    }
}
