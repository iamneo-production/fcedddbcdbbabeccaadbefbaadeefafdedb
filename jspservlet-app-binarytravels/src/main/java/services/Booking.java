package services;

public class Booking {
    public double booking(int nights, double pricePerNight) throws IllegalArgumentException {
        if (nights <= 0 || pricePerNight <= 0) {
            throw new IllegalArgumentException("Invalid input: nights and pricePerNight must be greater than zero");
        }
        
        return nights * pricePerNight;
    }
}
