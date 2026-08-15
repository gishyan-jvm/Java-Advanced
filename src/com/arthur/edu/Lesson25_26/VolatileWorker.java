package com.arthur.edu.Lesson25_26;

public class VolatileWorker extends Thread {
    private volatile boolean running = true;

    @Override
    public void run() {
        long iterations = 0;
        while (running) {
            iterations++;
        }
        System.out.println("[" + getName() + "] stopped after " + iterations + " iterations");
    }

    // Called from another thread to request this thread to stop.
    public void stopRunning() {
        running = false;
    }
}
