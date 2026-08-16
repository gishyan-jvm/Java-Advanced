package com.arthur.edu.Lesson25_26;

public class BackAccount {

    private static int amount = 1000;

    private final Object lock = new Object();

    public static int getAmount() {
        return amount;
    }

    public void transfer(int x) {

        synchronized (BackAccount.class) { //this is monitoring
            System.out.println("Transaction started");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Thread is dead(3000ms)");
            }

            amount -= x;
        }

    }

    public void test1() {
        synchronized (this) {
            System.out.println("Started test 1");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (lock) {
                System.out.println("Second sync(lock)");
            }
        }
    }

    public void test2() {
        synchronized (this) {
            System.out.println("test2 lock(1)");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock) {
                System.out.println("test2 Second sync(this)");
            }
        }
    }

}
