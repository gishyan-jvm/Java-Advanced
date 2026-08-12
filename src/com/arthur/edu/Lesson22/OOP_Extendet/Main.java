package com.arthur.edu.Lesson22.OOP_Extendet;

public class Main {
    public static void main(String[] args) {
        //low dependency
        Engine engine = new Engine();

        Car car = new Car(engine);

    }
}
