
package kz.barypkel.booking;

import kz.barypkel.booking.facade.BookingFacade;
import kz.barypkel.booking.model.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        BookingFacade facade = new BookingFacade();

        BookingRequest request = new BookingRequest(
                new Itinerary("Astana", "Almaty", LocalDate.now().plusDays(7)),
                new Passenger("Shugyla", "Akhit", "KZ1234567"),
                new PaymentDetails("5555444433331111", "SHUGYLA AKHIT")
        );

        BookingReceipt receipt = facade.bookFlight(request);
        System.out.println("Booked! PNR: " + receipt.getPnr());
    }
}
