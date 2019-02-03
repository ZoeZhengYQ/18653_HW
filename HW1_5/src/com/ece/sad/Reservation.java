package com.ece.sad;

public abstract class Reservation {
    abstract Hotel getHotel(String hotel);
    abstract Airline getAirline(String airline);
    abstract Taxi getTaxi(String taxi);
}
