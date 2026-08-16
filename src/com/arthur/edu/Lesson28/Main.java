package com.arthur.edu.Lesson28;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

//        ExecutorService executorService = Executors.newFixedThreadPool(100);
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);

//        for (int i = 0; i < 1000; i++) {
//            int finalI = i;
//            executorService.schedule(() -> System.out.println(Thread.currentThread().getName() + " - " + finalI),
//                    10,
//                    TimeUnit.SECONDS);
//        }
//
//        executorService.shutdown();


//        for (int i = 0; i < 10000; i++) {
//            int finalI = i;
//            executorService.execute(() -> System.out.println(Thread.currentThread().getName() + " - " + finalI));

//        executorService.shutdown();
//        executorService.shutdownNow();
//
//        System.out.println(executorService.isShutdown());
//        boolean b = executorService.awaitTermination(10, TimeUnit.SECONDS);
//
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//
//        Future<String> submit = executorService.submit(() -> {
//            Thread.sleep(10000);
//            return Thread.currentThread().getName();
//        });
//
//
//        String s = submit.get();
//
//        System.out.println(s);
//
//        executorService.shutdown();

        CompletableFuture<Object> integerCompletableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 5;
        });

        CompletableFuture<Object> objectCompletableFuture = integerCompletableFuture.thenApply(integer -> {
            System.out.println(integer);
            return null;
        });

        objectCompletableFuture.get();

        //WE FINISHED MULTITHREADING!!!
    }
}