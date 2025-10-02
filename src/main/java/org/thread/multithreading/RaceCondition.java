package org.thread.multithreading;

public class RaceCondition implements Runnable {

    int ticket = 1;

    @Override
    public void run() {
        System.out.println("Trying to book ticket" + Thread.currentThread().getName());
        synchronized (this) {
            if (ticket > 0) {
                System.out.println("Booking ticket for " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Ticket booked" + Thread.currentThread().getName());
                ticket--;
                System.out.println("available ticket" + ticket);
            }
            else {
                System.out.println("no ticket available");
            }
        }

    }
}
