
package kz.barypkel.booking.facade;

import kz.barypkel.booking.model.*;
import kz.barypkel.booking.subsystem.*;

public class BookingFacade {
    private InventoryService inventory = new InventoryService();
    private PricingService pricing = new PricingService();
    private PaymentService payment = new PaymentService();

    public BookingReceipt bookFlight(BookingRequest request) {
        if (!inventory.hasSeats(request.getItinerary())) {
            throw new IllegalArgumentException("No available seats!");
        }

        payment.charge(request.getPayment().getCardNumber());
        return pricing.quote(request.getItinerary());
    }
}
