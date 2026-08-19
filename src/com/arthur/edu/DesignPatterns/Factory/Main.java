package com.arthur.edu.DesignPatterns.Factory;

public class Main {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape(ShapeType.CIRCLE);
        shape.draw();

        Shape shape1 = ShapeFactory.getShape(ShapeType.RECTANGLE);
        shape1.draw();
    }
}
