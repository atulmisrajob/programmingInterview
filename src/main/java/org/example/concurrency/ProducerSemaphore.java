package org.example.concurrency;

import java.util.concurrent.Semaphore;

public class ProducerSemaphore implements Runnable{

   private final Semaphore producerSemaphore;
   private final Semaphore consumerSemaphore;

    public ProducerSemaphore(Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        try {
            for(int i=0;i<5;i++){
            producerSemaphore.acquire();
            System.out.println("produce "+i);
            consumerSemaphore.release();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
