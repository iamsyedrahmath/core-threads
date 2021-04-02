package com.core.threads.runnable;

public class RunnableDemo {
    public static void main(String[] args) {

        System.out.println("Star of main Thread");
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());

        t1.start();

        t2.start();

        System.out.println("End of main Thread");

    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("value "+i+" printed by thread :"+Thread.currentThread().getName());
        }
    }
}
