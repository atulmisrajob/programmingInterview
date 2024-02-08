package org.example.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQueueMain {

    public static void main(String[] args) {


        BlockingQueue<Integer> integerBlockingQueue = new LinkedBlockingQueue<>();
        ProducerBlockingQueue producerTask = new ProducerBlockingQueue(integerBlockingQueue);
        ConsumerBlockingQueue consumerTask = new ConsumerBlockingQueue(integerBlockingQueue);

        Thread producer = new Thread(producerTask);
        Thread consumer = new Thread(consumerTask);
        producer.start();
        consumer.start();
    }

}
