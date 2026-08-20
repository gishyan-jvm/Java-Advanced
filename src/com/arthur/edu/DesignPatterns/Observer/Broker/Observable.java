package com.arthur.edu.DesignPatterns.Observer.Broker;

public interface Observable {
    void register(Observer observer);

    void unRegister(Observer observer);

    void notifyBrokers();
}
