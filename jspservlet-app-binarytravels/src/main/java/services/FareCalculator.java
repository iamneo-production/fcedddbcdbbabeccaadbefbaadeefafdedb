package services;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

public class FareCalculator {
    public double book(Hotel hotel) throws IllegalArgumentException {
        if (hotel.getNumberOfRooms() <= 0 || hotel.getRoomType() == null || hotel.getPricePerNight() <= 0 || hotel.getCheckInDate() == null || hotel.getCheckOutDate() == null) {
            throw new IllegalArgumentException("Invalid input: hotel details are not valid");
        }

        int nights = calculateNights(hotel.getCheckOutDate(), hotel.getCheckInDate());
        return nights * hotel.getNumberOfRooms() * hotel.getPricePerNight();
    }

    public double book(Bus bus) throws IllegalArgumentException {
        if (bus.getNumberOfSeats() <= 0 || bus.getType() == null || bus.getPrice() <= 0 || bus.getTravelDate() == null) {
            throw new IllegalArgumentException("Invalid input: bus details are not valid");
        }

        return bus.getNumberOfSeats() * bus.getPrice();
    }

    public double book(Flight flight) throws IllegalArgumentException {
        if (flight.getNumberOfPassengers() <= 0 || flight.getClassType() == null || flight.getPrice() <= 0 || flight.getDepartureDate() == null || flight.getReturnDate() == null || flight.getTripType() == null) {
            throw new IllegalArgumentException("Invalid input: flight details are not valid");
        }

        if (((String) flight.getTripType()).equalsIgnoreCase("one-way")) {
            return flight.getNumberOfPassengers() * flight.getPrice();
        } else if (((String) flight.getTripType()).equalsIgnoreCase("round-trip")) {
            int numberOfNights = calculateNights(flight.getReturnDate(), flight.getDepartureDate());
            return 2 * flight.getNumberOfPassengers() * flight.getPrice() * numberOfNights;
        } else {
            throw new IllegalArgumentException("Invalid input: trip type is not valid");
        }
    }

    public double book(Train train) throws IllegalArgumentException {
        if (train.getNumberOfTickets() <= 0 || train.getType() == null || train.getPrice() <= 0 || train.getTravelDate() == null) {
            throw new IllegalArgumentException("Invalid input: train details are not valid");
        }

        return train.getNumberOfTickets() * train.getPrice();
    }

    private int calculateNights(LocalDate checkOutDate, LocalDate checkInDate) {
        long differenceDays = ChronoUnit.DAYS.between(checkInDate, checkOutDate);
        return Math.toIntExact(differenceDays);
    }
}
