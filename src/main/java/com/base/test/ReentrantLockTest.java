package com.base.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author kevin
 * @version V1.0
 * @Description: TODO
 * @date 2019/8/6 10:47
 **/
public class ReentrantLockTest {
    static Lock lock = new ReentrantLock(true);

    static class ThreadDemo implements Runnable {
        Integer id;

        public ThreadDemo(Integer currId) {
            this.id = id;
        }

        @Override

        public void run() {
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i=0;i<2;i++){
                lock.lock();
                System.out.println("获得锁的线程："+id);
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        for(int i=0;i<5;i++){
            new Thread(new ThreadDemo(i)).start();
        }

    }
}
