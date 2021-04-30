package com.company.upgrad;
import java.time.LocalDateTime;

public class Ticket {
    String prn,from,to;
    Flight flight;
    String departureDateTime,arrivalDateTime;
    Passenger passenger;
    String seatNo;
    float price;
    boolean cancelled;

    public Ticket(String prn, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean cancelled) {
        this.prn = prn;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
    }

    public String getPrn() {
        return prn;
    }

    public String checkStatus() {
        if(cancelled)
        {
            return "Cancelled";
        }
        return "Confirmed";
    }

    public int getFlightDuration() {
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDateTime);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDateTime);
        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 + (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }

    public void cancel()
    {
        cancelled =true;
    }


}
