package com.ece.sad;

public class ReservationAcquirer {

    public static Reservation getReservationType(String type) {

        if (type == null) return null;

        if (type.equalsIgnoreCase("hotel"))
            return new HotelReservation();

        else if (type.equalsIgnoreCase("taxi"))
            return new TaxiReservation();

        else if (type.equalsIgnoreCase("airline"))
            return new AirlineReservation();

        return null;
    }
}
