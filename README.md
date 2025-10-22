
# Simplified Assignment 5 — Facade Pattern

**Student:** Akhit Shugyla, Group SE-2403  
**Topic:** Airline Ticket Booking System using `BookingFacade`


## 1. Purpose of the Work
This project demonstrates the **Facade Pattern** by simplifying the complex airline booking system into a single entry point, **`BookingFacade`**, while keeping the internal logic simple.

## 2. Clean Code Principles Used
- Simple methods with clear names.
- One responsibility per class.
- Minimal complexity with only essential validations.

## 3. Architecture Overview
- `BookingFacade` handles the booking process by coordinating with different subsystems like inventory, payment, and loyalty services.

## 4. UML Class Diagram

```plantuml
@startuml
skinparam classAttributeIconSize 0

package "kz.barypkel.booking.facade" {
  class BookingFacade {
    +getQuote(Itinerary): Quote
    +bookOneWayFlight(BookingRequest): BookingReceipt
    +cancelBooking(...): void
  }
}

package "kz.barypkel.booking.subsystem" {
  class InventoryService {
    +hasSeats(Itinerary): boolean
    +reserveSeat(String): void
    +release(String): void
  }

  class PricingService {
    +quote(Itinerary): Quote
  }

  class PaymentService {
    +charge(String): void
  }
}

package "kz.barypkel.booking.model" {
  class BookingRequest {
    +Itinerary itinerary
    +Passenger passenger
    +PaymentDetails payment
  }

  class Passenger {
    +String firstName
    +String lastName
    +String passport
  }

  class Itinerary {
    +String from
    +String to
    +LocalDate date
  }

  class PaymentDetails {
    +String cardNumber
    +String cardHolder
  }

  class BookingReceipt {
    +String bookingId
    +String pnr
  }

  class Quote {
    +long basePriceKzt
    +long taxesKzt
    +long totalKzt
  }
}

BookingFacade --> InventoryService : uses
BookingFacade --> PricingService : uses
BookingFacade --> PaymentService : uses

BookingRequest --> Itinerary
BookingRequest --> Passenger
BookingRequest --> PaymentDetails

BookingFacade --> BookingRequest : accepts

InventoryService --> Itinerary : processes
PricingService --> Itinerary : processes
PaymentService --> PaymentDetails : uses
@enduml
