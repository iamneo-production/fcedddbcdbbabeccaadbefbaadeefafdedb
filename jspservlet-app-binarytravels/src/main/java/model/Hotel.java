package model;

import java.time.LocalDate;

public class Hotel {
    private int noOfPersons;
    private String roomType;
    private int rates;
    private String occupancy;
    private LocalDate fromDate;
    private LocalDate toDate;

    
    public Hotel(int noOfPersons, String roomType, int rates, String occupancy, LocalDate fromDate, LocalDate toDate) {
        this.noOfPersons = noOfPersons;
        this.roomType = roomType;
        this.rates = rates;
        this.occupancy = occupancy;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    
    public int getNoOfPersons() {
        return noOfPersons;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getRates() {
        return rates;
    }

    public String getOccupancy() {
        return occupancy;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    
    public void setNoOfPersons(int noOfPersons) {
        this.noOfPersons = noOfPersons;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setRates(int rates) {
        this.rates = rates;
    }

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }


    public LocalDate getCheckOutDate() {
        return null;
    }


    public LocalDate getCheckInDate() {
        return null;
    }


    public int getSingleOccupancyRate() {
        return 0;
    }


    public int getNumberOfRooms() {
        return 0;
    }


    public int getPricePerNight() {
        return 0;
    }
}
