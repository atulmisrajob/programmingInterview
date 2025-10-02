package org.thread.concurrency;

import java.util.concurrent.Semaphore;

public class ProducerConsumerSemaphore {

    public static void main(String[] args) {
        Semaphore producerSemaphore= new Semaphore(1);
        Semaphore consumerSemaphore= new Semaphore(0);

        ProducerSemaphore producer= new ProducerSemaphore(producerSemaphore,consumerSemaphore);
        ConsumerSemaphore consumer= new ConsumerSemaphore(producerSemaphore,consumerSemaphore);

        Thread t1= new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();



    }

}

