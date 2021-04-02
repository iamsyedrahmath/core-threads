package com.core.threads.runnable;

public class JoinRunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Star of main Thread");
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());

        t1.start();
        t2.start();
        t1.join();//to observe the behaviour of join() comment/uncomment the t1.join() statement and check the out put. t1 thread should complete before main thread if it is uncomment

        System.out.println("End of main Thread");
    }
}


