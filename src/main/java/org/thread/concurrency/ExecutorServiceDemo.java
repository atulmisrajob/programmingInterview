package org.thread.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

    private static final int nThread = 2;
    private static final int nTask = 10;

    public static void main(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(8);
        int numThreads = Runtime.getRuntime().availableProcessors();
        System.out.println(numThreads);
        for (int i = 0; i < nTask; i++) {
            int finalI = i;
            executorService.execute(() -> {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " executing task no " + finalI);

            });
        }
        executorService.shutdown();

        System.out.println("executor has been shutDown.");

    }

}
