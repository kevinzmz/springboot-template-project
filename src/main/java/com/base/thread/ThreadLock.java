package com.base.thread;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ThreadLock
 *
 * @author kevin
 * @version 1.0
 * @date 2021/4/1 10:24
 */
public class ThreadLock implements Runnable{
    private String group;
    private long sleepTime;
    public ThreadLock(String group, long sleepTime){
        this.group = group;
        this.sleepTime = sleepTime;
    }
    @Override
    public void run() {
        LockClass lockClass = new LockClass();
        lockClass.handle(group,sleepTime);
    }
}

class LockClass {
    public static AtomicInteger lock = new AtomicInteger(1);

    public void handle(String group, long sleepTime){
        synchronized (lock){
            System.out.println("This thread is " + Thread.currentThread().getId() + " ,Group is " + group);
            try {
                Thread.sleep(sleepTime);
                System.out.println("This thread is " + Thread.currentThread().getId() + ", SleepTime is " + sleepTime );
                System.out.println(" End Time is " + new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TestThreadLock{
    public static void main(String[] args) {
        System.out.println("Current Time is " + new Date());
        Thread a1 = new Thread(new ThreadLock("g1", 2000L));
        Thread a2 = new Thread(new ThreadLock("g2", 500L));

        a1.start();
        a2.start();
    }
}
