package com.arthur.edu.Lesson25_26;

public class Singleton {

    private volatile static Singleton instance1;

    //double-checked sync
    public static Singleton getInstance() {
        if (instance1 == null) {
            synchronized (Singleton.class) {
                if (instance1 == null) {
                    instance1 = new Singleton();
                }
            }
        }
        return instance1;
    }


    //or we can do it easier using holder class

    private static final class InstanceHolder {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance1() {
        return InstanceHolder.instance;
    }

}
