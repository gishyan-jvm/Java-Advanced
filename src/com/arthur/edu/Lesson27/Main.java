package com.arthur.edu.Lesson27;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== wait / notify ===");
        WaitNotifyExample wn = new WaitNotifyExample();

        Thread consumer = new Thread(wn::consume, "Consumer");
        consumer.start();

        Thread.sleep(500);

        Thread producer = new Thread(() -> wn.produce("Hello!"), "Producer");
        producer.start();

        consumer.join();
        producer.join();

        System.out.println("\n=== Lock ===");
        LockExample account = new LockExample();
        Thread[] depositors = new Thread[3];
        for (int i = 0; i < depositors.length; i++) {
            depositors[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    account.deposit(1);
                }
            });
            depositors[i].start();
        }
        for (Thread t : depositors) {
            t.join();
        }
        System.out.println("Balance (expected 3000): " + account.getBalance());

        System.out.println("\n=== Atomic ===");
        AtomicExample atomic = new AtomicExample();
        Thread[] workers = new Thread[3];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    atomic.increment();
                }
            });
            workers[i].start();
        }
        for (Thread t : workers) {
            t.join();
        }
        System.out.println("Counter (expected 3000): " + atomic.getValue());
    }
}
