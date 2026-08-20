package com.arthur.edu.DesignPatterns.Strategy;

public class IdramPaymentStrategy implements PaymentStrategy{

    private String phoneNumber;

    public IdramPaymentStrategy(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.printf("Payed with Idram %s : %d%n", phoneNumber, amount);
    }

}
