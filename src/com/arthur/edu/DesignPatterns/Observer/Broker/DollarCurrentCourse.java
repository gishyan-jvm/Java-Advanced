package com.arthur.edu.DesignPatterns.Observer.Broker;

import java.util.ArrayList;
import java.util.List;

public class DollarCurrentCourse implements Observable {

    private List<Observer> observers = new ArrayList<>();

    private double currentDollarCourseAMD;

    public DollarCurrentCourse(double currentDollarCourseAMD) {
        this.currentDollarCourseAMD = currentDollarCourseAMD;
    }

    public void changeCurrentCourse(double newValue) {
        currentDollarCourseAMD = newValue;
        notifyBrokers();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyBrokers() {
        observers.forEach(observer -> observer.update(currentDollarCourseAMD));
    }
}
