package model;

import java.time.LocalDate;

public class Train {
    private int noOfPersons;
    private String berth;
    private int rates;
    private LocalDate date;

    
    public Train(int noOfPersons, String berth, int rates, LocalDate date) {
        this.noOfPersons = noOfPersons;
        this.berth = berth;
        this.rates = rates;
        this.date = date;
    }

    
    public int getNoOfPersons() {
        return noOfPersons;
    }

    public String getBerth() {
        return berth;
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

    public void setBerth(String berth) {
        this.berth = berth;
    }

    public void setRates(int rates) {
        this.rates = rates;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    public int getNumberOfTickets() {
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
