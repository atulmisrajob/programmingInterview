package org.thread.multithreading;

public class RaceConditionMain {
    public static void main(String[] args) {

        RaceCondition raceCondition= new RaceCondition();
        Thread t1= new Thread(raceCondition,"race1");
        Thread t2 = new Thread(raceCondition,"race2");

        t1.start();
        t2.start();
    }
}
