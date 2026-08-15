package com.arthur.edu.Lesson25_26;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread: " + Thread.currentThread().getName());
        Thread counter = new CounterThread("Counter", 5);
        counter.start();

        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("[" + Thread.currentThread().getName() + "] Runnable step " + i);
                sleep(200);
            }
        };
        Thread runnableThread = new Thread(task, "RunnableWorker");
        runnableThread.start();

        counter.join();
        runnableThread.join();

        SharedCounter shared = new SharedCounter();
        Thread[] workers = new Thread[4];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    shared.increment();
                }
            }, "Incrementer-" + i);
            workers[i].start();
        }
        for (Thread w : workers) {
            w.join();
        }
        System.out.println("Final counter value (expected 4000): " + shared.getValue());

        VolatileWorker volatileWorker = new VolatileWorker();
        volatileWorker.setName("VolatileWorker");
        volatileWorker.start();
        sleep(500);
        volatileWorker.stopRunning();
        volatileWorker.join();

        System.out.println("Main thread finished.");
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
