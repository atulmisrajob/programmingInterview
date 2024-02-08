package org.example.concurrency;

import java.util.concurrent.Semaphore;

public class ConsumerSemaphore implements Runnable{

    private final Semaphore producerSemaphore;
    private final Semaphore consumerSemaphore;

    public ConsumerSemaphore(Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }


    @Override
    public void run() {
        try {
            for(int i=0;i<5;i++){
                consumerSemaphore.acquire();
                System.out.println("consume "+i);
                producerSemaphore.release();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
