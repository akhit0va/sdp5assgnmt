
package kz.barypkel.booking.subsystem;

import kz.barypkel.booking.model.Itinerary;
import kz.barypkel.booking.model.BookingReceipt;

public class PricingService {
    public BookingReceipt quote(Itinerary itinerary) {
        return new BookingReceipt("ABC123", "PNR123");
    }
}
