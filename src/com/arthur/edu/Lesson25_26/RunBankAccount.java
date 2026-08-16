package com.arthur.edu.Lesson25_26;

public class RunBankAccount {
    public static void main(String[] args) throws InterruptedException {
        BackAccount backAccount = new BackAccount();
        BackAccount backAccount2 = new BackAccount();

        Thread thread = new Thread(() -> backAccount.transfer(500));
        Thread thread2 = new Thread(() -> backAccount2.transfer(500));

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(BackAccount.getAmount());

        BackAccount account = new BackAccount();

        Thread t1 = new Thread(account::test1);
        Thread t2 = new Thread(account::test2);

        t1.start();
        t2.start();

    }
}
