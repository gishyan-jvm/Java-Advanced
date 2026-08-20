package com.arthur.edu.DesignPatterns.Observer.Market;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.printf("Observer %s got message: %s\n", name, message);
    }
}
