package model;

import java.time.LocalDate;

public class Flight {
    private int noOfPersons;
    private String classType;
    private int rates;
    private LocalDate from;
    private LocalDate to;
    private String triptype;

    
    public Flight(int noOfPersons, String classType, int rates, LocalDate from, LocalDate to, String triptype) {
        this.noOfPersons = noOfPersons;
        this.classType=classType;
        this.rates = rates;
        this.from = from;
        this.to = to;
        this.triptype = triptype;
    }

    
    public int getNoOfPersons() {
        return noOfPersons;
    }

    public String getClassType() {
        return classType;
    }

    public int getRates() {
        return rates;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public String getTriptype() {
        return triptype;
    }

    
    public void setNoOfPersons(int noOfPersons) {
        this.noOfPersons = noOfPersons;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public void setRates(int rates) {
        this.rates = rates;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    public void setTriptype(String triptype) {
        this.triptype = triptype;
    }


    public LocalDate getDepartureDate() {
        return null;
    }


    public LocalDate getReturnDate() {
        return null;
    }


    public boolean isOneWay() {
        return false;
    }


    public int getNumberOfPassengers() {
        return 0;
    }


    public int getPrice() {
        return 0;
    }


    public Object getTripType() {
        return null;
    }
}
