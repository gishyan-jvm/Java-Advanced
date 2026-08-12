package com.arthur.edu.Lesson22;

public interface InterfaceFeatures {

    String SOME_STRING = "Hello"; //constant

    //we can have a body methods like abstract class

    default void sayHelloFromInterface() {
        System.out.println("Hello from interface");
    }

    //we can also have static methods

    static void interfaceStaticMethod() {
        System.out.println("Hello from interface static method");
    }

}
