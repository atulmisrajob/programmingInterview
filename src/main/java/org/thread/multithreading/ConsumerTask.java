package org.thread.multithreading;

import java.util.List;

public class ConsumerTask implements Runnable {

    private List<Integer> sharedQueue;

    public ConsumerTask(List<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consume();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void consume() throws InterruptedException {

        synchronized (sharedQueue) {
            while (sharedQueue.isEmpty()) {
                System.out.println("Queue is empty");
                sharedQueue.wait();
            }
        }
        synchronized (sharedQueue) {
            Thread.sleep(1000);
            System.out.println("Queue data remove " + sharedQueue.removeFirst());
            sharedQueue.notify();
        }
    }
}
