package org.thread.multithreading;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerMain {

    public static void main(String[] args) {


        List<Integer> sharedData = new ArrayList<>();
        ProducerTask producerTask = new ProducerTask(sharedData);
        ConsumerTask consumerTask = new ConsumerTask(sharedData);

        Thread producer = new Thread(producerTask);
        Thread consumer = new Thread(consumerTask);
        producer.start();
        consumer.start();
    }

}
