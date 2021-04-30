package com.company.upgrad;

public class Flight {
    String flightNumber;
    String airline;
    int capacity;
    int bookedSeats;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails() {
        return "FlightNumber : "+getFlightNumber()+" Airline : "+getAirline()+" Capacity : "+getCapacity()+" Booked Seats : "+getBookedSeats();
    }

    public boolean checkAvailability() {
        boolean status = bookedSeats < capacity;
        return  status;
    }

    public void increamentBookingCounter() {
        bookedSeats = bookedSeats + 1;
    }
}
