package com.arthur.edu.DesignPatterns.Observer.Market;

import java.util.ArrayList;
import java.util.List;

public class AdidasShop implements Observable {

    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String message) {
        for (Observer observer : subscribers) {
            observer.update(message);
        }
    }
}
