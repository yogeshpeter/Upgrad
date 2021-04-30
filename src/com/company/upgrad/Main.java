package com.company.upgrad;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ticket regularTicket = new RegularTicket("1111","chennai","mumbai",null,"11/03/14 09:29:58","11/03/14 09:33:43",null,"22",15000f,false,"food");
        Ticket touristTicked = new TouristTicket("2222","chennai","delhi",null,"11/03/14 09:33:43","11/03/14 10:33:43",null,"33",13000f,false,"taj hotel");

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicked);
    }

    public static void printTicketDetails(Ticket ticket)
    {
        System.out.println(ticket.getPrn());
    }
}

    //public Ticket(String prn, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean cancelled)

  //  public RegularTicket(String prn, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean cancelled,String specialServices) {

   // public TouristTicket(String prn, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean cancelled, String hotelAddress, String[] selectedTouristLocation) {
