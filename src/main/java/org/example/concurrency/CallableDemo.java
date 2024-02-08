package org.example.concurrency;

import java.util.concurrent.*;
import java.util.stream.IntStream;


public class CallableDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Double> doubleFuture = executorService.submit(() -> square(2.0));
        Future<Integer> doubleInteger = executorService.submit(() -> sum(4));


        System.out.println("SquareDoubleCallable has returned > " + doubleFuture.get());
        System.out.println("SumIntegerCallable has returned > " + doubleInteger.get(2000, TimeUnit.MILLISECONDS));

        executorService.shutdown();
    }

    private static Integer sum(int i) throws InterruptedException {
        Thread.sleep(9000);
        return IntStream.rangeClosed(0, i).sum();
    }

    private static Double square(Double i) {
        return i * i;
    }
}
