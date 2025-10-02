package org.thread.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenOddAtomicInteger {

    static AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {
        Runnable runnable = () -> {
            synchronized (atomicInteger) {
                while (atomicInteger.get() < 10) {
                    if (atomicInteger.get() % 2 == 0 && Thread.currentThread().getName().equals("Even")) {
                        System.out.println("Even " + atomicInteger.getAndIncrement());
                    } else {
                        System.out.println("Odd " + atomicInteger.getAndIncrement());
                    }
                }
            }

        };

        Thread t1 =new Thread(runnable);
        t1.setName("Even");
        t1.start();
        Thread t2 =new Thread(runnable);
        t2.setName("Odd");
        t2.start();

    }

}
