package com.arthur.edu.Lesson27;

public class WaitNotifyExample {
    private String message = null;

    public synchronized void consume() {
        while (message == null) {
            System.out.println("[Consumer] No message yet, waiting...");
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println("[Consumer] Got message: " + message);
    }

    public synchronized void produce(String text) {
        message = text;
        System.out.println("[Producer] Message produced: " + text);
        notify();
    }
}
