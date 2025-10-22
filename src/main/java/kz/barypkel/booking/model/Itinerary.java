
package kz.barypkel.booking.model;

import java.time.LocalDate;

public class Itinerary {
    private String from;
    private String to;
    private LocalDate date;

    public Itinerary(String from, String to, LocalDate date) {
        this.from = from;
        this.to = to;
        this.date = date;
    }

    // Getters and Setters
}
