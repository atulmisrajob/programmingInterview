package org.thread.multithreading;

import java.util.ArrayList;
import java.util.List;

public class ProducerTask implements Runnable {

    List<Integer> sharedData = new ArrayList<>();
    int MAX_SIZE = 2;

    public ProducerTask(List<Integer> sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                produce(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private void produce(int i) throws InterruptedException {
        synchronized (sharedData) {
            while (sharedData.size() == MAX_SIZE) {
                System.out.println("Queeue is full");
                sharedData.wait();
            }
        }

        synchronized (sharedData) {
            System.out.println("sharedData  " + i);
            sharedData.add(i);
            Thread.sleep(2000);
            sharedData.notify();
        }
    }
}
