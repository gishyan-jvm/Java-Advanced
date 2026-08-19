package com.arthur.edu.DesignPatterns.Factory;

public class ShapeFactory {

    public static Shape getShape(ShapeType type) {
        return switch (type) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
        };
    }



}
