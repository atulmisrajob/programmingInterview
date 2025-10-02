package org.thread.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=0;i<4;i++){
            int taskId=i;
            executorService.submit(()->{
                System.out.println("task  "  +taskId+ "  excuted By "+Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }
}
