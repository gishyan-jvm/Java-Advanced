package com.arthur.edu.Lesson22.OOP_Extendet;

public class Car {
    //this is strong dependency
    private final Engine engine = new Engine();
    private final Engine engine1;

    //this is low dependency which is better
    public Car(Engine engine) {
        this.engine1 = engine;
    }



    public Engine getEngine() {
        return engine;
    }


}
