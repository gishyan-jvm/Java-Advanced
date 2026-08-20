package com.arthur.edu.DesignPatterns.Strategy;

public class CardPaymentStrategy implements PaymentStrategy {

    private String fullName;
    private String cardNumber;
    private int cvv;
    private String expDate;

    public CardPaymentStrategy(String fullName, String cardNumber, int cvv, String expDate) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expDate = expDate;
    }

    @Override
    public void pay(int amount) {
        System.out.printf("User %s do card payment. \n Amount: %d", fullName, amount);
        System.out.printf("Card number: ************%s \ncvv: ***\nExpire date: %s", cardNumber.substring(12), expDate);
    }
}
