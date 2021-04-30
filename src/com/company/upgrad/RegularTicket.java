package com.company.upgrad;

public class RegularTicket extends Ticket{

    public String specialService;

    public RegularTicket(String prn, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean cancelled,String specialServices) {

        super(prn, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price, cancelled);
        this.specialService = specialServices;
    }

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }
}

//    public RegularTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Flight flight, Passenger passenger, float price, boolean cancelled) {
//        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, flight, passenger, price, cancelled);
//        this.specialServices= specialServices;
//    }