package org.thread.multithreading;

import java.util.concurrent.BlockingQueue;

public class ProducerBlockingQueue implements Runnable{

    private final BlockingQueue<Integer> integerBlockingQueue;

    public ProducerBlockingQueue(BlockingQueue<Integer> integerBlockingQueue) {
        this.integerBlockingQueue = integerBlockingQueue;
    }

    @Override
    public void run() {
    for (int i=0;i<10;i++){
        System.out.println("produce"+i);
        try {
            integerBlockingQueue.put(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    }
}
