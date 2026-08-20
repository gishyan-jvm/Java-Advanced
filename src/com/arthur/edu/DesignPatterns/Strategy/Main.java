package com.arthur.edu.DesignPatterns.Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy cardPaymentStrategy = new CardPaymentStrategy(
                "Arthur"
                , "0000000000112231",
                123,
                "07/27");

        PaymentStrategy idramPaymentStrategy = new IdramPaymentStrategy("+3747781401");

        Product laptop = new Product("Macbook", 390000);
        Product phone = new Product("Iphone", 290000);

        BasketService basketService = new BasketService();

        //User side

        basketService.add(laptop);
        basketService.add(phone);

        basketService.remove(laptop);

        Scanner scanner = new Scanner(System.in);

        String type = scanner.next();

        switch (type) {
            case "CARD" -> basketService.pay(cardPaymentStrategy);
            case "IDRAM" -> basketService.pay(idramPaymentStrategy);
        }

    }
}
