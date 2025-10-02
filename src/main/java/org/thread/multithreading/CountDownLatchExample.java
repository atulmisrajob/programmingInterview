package org.thread.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch= new CountDownLatch(3);

        new Thread(()->{
            System.out.println("service 1 starting....");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ex){}
            System.out.println("service 1 started "+ latch.getCount());
            latch.countDown();
        }).start();

        new Thread(()->{
            System.out.println("service 2 starting....");
            try{
                Thread.sleep(1500);
            }catch (InterruptedException ex){}
            System.out.println("service 2 started "+ latch.getCount());
            latch.countDown();
        }).start();

        new Thread(()->{
            System.out.println("service 3 starting....");
            try{
                Thread.sleep(800);
            }catch (InterruptedException ex){}
            System.out.println("service 3 started "+ latch.getCount());
            latch.countDown();
        }).start();

        latch.await();
        System.out.println(" all service  started ");

    }
}
