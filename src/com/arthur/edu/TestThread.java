package com.arthur.edu;

public class TestThread implements Runnable{

    volatile boolean isKeepRunning = true;

    @Override
    public void run() {
        int count = 0;

        while (isKeepRunning) {
            count++;
        }

        System.out.printf("Count: %d", count);
    }
}
