package com.arthur.edu;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        TestThread task = new TestThread();
        Thread thread = new Thread(task);

        thread.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("thread is dead");
        }

        task.isKeepRunning = false;

    }
}