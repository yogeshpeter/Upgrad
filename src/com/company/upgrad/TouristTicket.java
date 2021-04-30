package com.company.upgrad;

public class TouristTicket extends Ticket {

    String hotelAddress;
    String selectedTouristLocation[];

    public TouristTicket(String prn, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean cancelled, String hotelAddress) {
        super(prn, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price, cancelled);
        this.hotelAddress = hotelAddress;

    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void removeTouristLocation(String location)
    {
        int locationIndex = -1;
        for(int i = 0;i<selectedTouristLocation.length;i++) {
            if(selectedTouristLocation[i] == location)
            {
                locationIndex = i;
                break;
            }
        }
        if(locationIndex == -1)
        {
            return ;
        }
        for(int i = locationIndex;i<selectedTouristLocation.length -1;i++) {
            selectedTouristLocation[i] = selectedTouristLocation[i+1];
        }
        selectedTouristLocation[selectedTouristLocation.length - 1] = null;
    }

    public void addTouristLocation(String location) {
        selectedTouristLocation[selectedTouristLocation.length] = location;
    }
}
