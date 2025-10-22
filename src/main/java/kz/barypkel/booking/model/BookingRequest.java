package kz.barypkel.booking.model;

public class BookingRequest {
    private Itinerary itinerary;
    private Passenger passenger;
    private PaymentDetails payment;

    public BookingRequest(Itinerary itinerary, Passenger passenger, PaymentDetails payment) {
        this.itinerary = itinerary;
        this.passenger = passenger;
        this.payment = payment;
    }

    // Геттеры для каждого поля
    public Itinerary getItinerary() {
        return itinerary;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public PaymentDetails getPayment() {
        return payment;
    }
}
