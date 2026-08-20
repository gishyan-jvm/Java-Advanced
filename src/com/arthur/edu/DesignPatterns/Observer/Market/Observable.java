package com.arthur.edu.DesignPatterns.Observer.Market;

public interface Observable {
    void register(Observer observer);

    void unRegister(Observer observer);

    void notifySubscribers(String message);
}
