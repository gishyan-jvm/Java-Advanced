package com.arthur.edu.DesignPatterns.Observer.Broker;

public class Broker implements Observer {

    private double happyCourse;

    private String name;

    public Broker(double happyCourse, String name) {
        this.happyCourse = happyCourse;
        this.name = name;
    }

    @Override
    public void update(double currentDollarCourseAMD) {
        if (currentDollarCourseAMD > happyCourse)
            System.out.printf("Broker %s is happy\n", name);
        else
            System.out.printf("Broker %s is sad\n", name);
    }
}
