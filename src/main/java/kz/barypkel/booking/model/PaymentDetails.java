package kz.barypkel.booking.model;

public class PaymentDetails {
    private String cardNumber;
    private String cardHolder;

    public PaymentDetails(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    // Геттер для cardNumber
    public String getCardNumber() {
        return cardNumber;
    }

    // Геттер для cardHolder (если требуется)
    public String getCardHolder() {
        return cardHolder;
    }
}
