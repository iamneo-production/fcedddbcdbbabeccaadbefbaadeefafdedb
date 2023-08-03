package model;

import java.time.LocalDate;

public class Bus {
    private int noOfPersons;
    private String busType;
    private int rates;
    private LocalDate date;

    
    public Bus(int noOfPersons, String busType, int rates, LocalDate date) {
        this.noOfPersons = noOfPersons;
        this.busType = busType;
        this.rates = rates;
        this.date = date;
    }

    
    public int getNoOfPersons() {
        return noOfPersons;
    }

    public String getBusType() {
        return busType;
    }

    public int getRates() {
        return rates;
    }

    public LocalDate getDate() {
        return date;
    }

    
    public void setNoOfPersons(int noOfPersons) {
        this.noOfPersons = noOfPersons;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public void setRates(int rates) {
        this.rates = rates;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    public int getNumberOfSeats() {
        return 0;
    }


    public Object getType() {
        return null;
    }


    public int getPrice() {
        return 0;
    }


    public Object getTravelDate() {
        return null;
    }
}

