package com.arthur.edu.practic;

public class Rectangle {
    private final float width;
    private final float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float square() {
        return width * height;
    }

    public float perimeter() {
        return 2 * (width + height);
    }

    public float diagonal() {
        return (float) Math.hypot(width, height);
    }
}