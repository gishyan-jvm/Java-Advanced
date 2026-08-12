package com.arthur.edu.Lesson22;

public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new Singleton();
        return instance;
    }

    public int sum(int... x) {
        int sum = 0;

        for (int i : x) {
            sum += i;
        }
        return sum;
    }
}
