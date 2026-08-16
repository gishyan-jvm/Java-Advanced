package com.arthur.edu.Lesson25_26;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        System.out.println(instance2 == instance);
        System.out.println(instance2 == instance3);
    }
}
