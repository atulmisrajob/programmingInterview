package org.thread.multithreading;

import java.util.concurrent.BlockingQueue;

public class ConsumerBlockingQueue implements Runnable{

    private final BlockingQueue<Integer> integerBlockingQueue;

    public ConsumerBlockingQueue(BlockingQueue<Integer> integerBlockingQueue) {
        this.integerBlockingQueue = integerBlockingQueue;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("Queue Data Removed"+integerBlockingQueue.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
