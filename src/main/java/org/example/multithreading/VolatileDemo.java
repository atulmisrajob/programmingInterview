package org.example.multithreading;

public class VolatileDemo {
    static int x=0,y=0;

    static void method1(){
        x++;
        y++;
    }
    static void method2(){
        System.out.println("X="+x+" Y="+y);
    }

    public static void main(String[] args) {
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    method1();
                }
            }
        });
        Thread t3= new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    method1();
                }
            }
        });
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    method2();
                }
            }
        });
        t2.start();
        t1.start();
        t3.start();


    }

}
