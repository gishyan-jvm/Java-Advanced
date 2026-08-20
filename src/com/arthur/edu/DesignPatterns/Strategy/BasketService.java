package com.arthur.edu.DesignPatterns.Strategy;

import java.util.ArrayList;
import java.util.List;

public class BasketService {

    List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }

    private int calculateTotalPrice() {
        return products.stream()
                .map(Product::getPrice)
                .reduce(Integer::sum)
                .orElse(0);
    }

    public void pay(PaymentStrategy paymentStrategy) {
        int price = calculateTotalPrice();
        System.out.printf("Payment processing: %d", price);
        System.out.println();

        paymentStrategy.pay(price);

        System.out.printf("Payment done: %d", price);
        System.out.println();
    }
}
