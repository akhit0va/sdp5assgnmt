
package kz.barypkel.booking;

import kz.barypkel.booking.facade.BookingFacade;
import kz.barypkel.booking.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookingFacadeTest {

    @Test
    void bookFlight_createsBooking() {
        BookingFacade facade = new BookingFacade();
        BookingRequest request = new BookingRequest(
                new Itinerary("Astana", "Almaty", LocalDate.now().plusDays(2)),
                new Passenger("Test", "User", "P123"),
                new PaymentDetails("4111111111111111", "TEST USER")
        );

        BookingReceipt receipt = facade.bookFlight(request);

        assertNotNull(receipt.getPnr());
    }
}
