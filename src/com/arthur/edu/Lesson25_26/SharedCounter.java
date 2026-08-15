package com.arthur.edu.Lesson25_26;

public class SharedCounter {
    private int value = 0;

    public synchronized void increment() {
        value++;
    }

    public synchronized int getValue() {
        return value;
    }
}
