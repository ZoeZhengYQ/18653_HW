package com.ece.sad;

public class Main {

    public static void main(String[] args) {
        // getting reservation of hotel
	    Reservation hotelReservation = ReservationAcquirer.getReservationType("hotel");

	    Hotel hotel1 = hotelReservation.getHotel("hilton");
	    hotel1.getHotelReservation();

	    Hotel hotel2 = hotelReservation.getHotel("marriott");
	    hotel2.getHotelReservation();

	    // getting reservation of taxi
	    Reservation taxiReservation = ReservationAcquirer.getReservationType("taxi");

	    Taxi taxi1 = taxiReservation.getTaxi("lyft");
	    taxi1.getTaxiReservation();

	    Taxi taxi2 = taxiReservation.getTaxi("uber");
	    taxi2.getTaxiReservation();

	    // getting reservation of airline
	    Reservation airlineReservation = ReservationAcquirer.getReservationType("airline");

	    Airline airline1 = airlineReservation.getAirline("jetblue");
	    airline1.getAirlineReservation();

	    Airline airline2 = airlineReservation.getAirline("delta");
	    airline2.getAirlineReservation();
    }
}
