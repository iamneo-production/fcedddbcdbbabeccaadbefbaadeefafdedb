package services;

import java.time.LocalDate;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;
import services.Booking;
import services.FareCalculator;

public class Main {
    public static void main(String[] args) {
        
        FareCalculator fareCalculator = new FareCalculator();
        Booking booking = new Booking();

        
        Hotel hotel = new Hotel(2, "Standard", 100, "Double", LocalDate.of(2023, 7, 1), LocalDate.of(2023, 7, 5));

        try {
            double hotelFare = fareCalculator.book(hotel);
            System.out.println("Hotel Fare: " + hotelFare);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Bus bus = new Bus(30, "AC", 50, LocalDate.of(2023, 7, 1));

        try {
            double busFare = fareCalculator.book(bus);
            System.out.println("Bus Fare: " + busFare);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Flight flight = new Flight(2, "Economy", 200, LocalDate.of(2023, 7, 1), LocalDate.of(2023, 7, 5), "Round-trip");

        try {
            double flightFare = fareCalculator.book(flight);
            System.out.println("Flight Fare: " + flightFare);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Train train = new Train(4, "Sleeper", 30, LocalDate.of(2023, 7, 1));

        try {
            double trainFare = fareCalculator.book(train);
            System.out.println("Train Fare: " + trainFare);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        
        int nights = 3;
        double pricePerNight = 150;

        try {
            double totalBookingFare = booking.booking(nights, pricePerNight);
            System.out.println("Total Booking Fare: " + totalBookingFare);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
