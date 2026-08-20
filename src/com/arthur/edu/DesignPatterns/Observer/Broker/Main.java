package com.arthur.edu.DesignPatterns.Observer.Broker;

public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker(395.0, "broker1");
        Broker broker2 = new Broker(305.0, "broker2");
        Broker broker3 = new Broker(460.0, "broker3");

        DollarCurrentCourse currentCourse = new DollarCurrentCourse(388);

        currentCourse.register(broker);
        currentCourse.register(broker2);
        currentCourse.register(broker3);

        currentCourse.changeCurrentCourse(450);

    }
}
