package org.thread.multithreading;

public class EvenOddTask {
    int counter = 1;
    static int N;

    public void printOddNumber() {
        synchronized (this) {
            while (counter < N) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(counter + "odd");
                counter++;
                notify();
            }
        }
    }

    public void printEvenNumber() {
        synchronized (this) {
            while (counter < N) {
                while (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(counter + "even");
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        N = 10;
        EvenOddTask evenOddTask = new EvenOddTask();

        Thread t1 = new Thread(evenOddTask::printOddNumber);

        Thread t2 = new Thread(evenOddTask::printEvenNumber);

        t1.start();
        t2.start();
    }
}
