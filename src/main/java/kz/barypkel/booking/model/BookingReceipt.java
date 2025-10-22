
package kz.barypkel.booking.model;

public class BookingReceipt {
    private String bookingId;
    private String pnr;

    public BookingReceipt(String bookingId, String pnr) {
        this.bookingId = bookingId;
        this.pnr = pnr;
    }

    // Геттер для PNR
    public String getPnr() {
        return pnr;
    }

    // Геттер для BookingId (если требуется)
    public String getBookingId() {
        return bookingId;
    }
}
