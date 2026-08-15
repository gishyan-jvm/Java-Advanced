package com.arthur.edu.Lesson25_26;

public class CounterThread extends Thread {
    private final int limit;

    public CounterThread(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 1; i <= limit; i++) {
            System.out.println("[" + getName() + "] count = " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
