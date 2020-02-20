package com.base.test;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * <p>测试Thread</p>
 *
 * @author kevin
 * @create 2018-03-22 13:49
 **/
public class TestThread {
    public static void main(String[] args) {
        ThreadGroup a = new ThreadGroup("a");
        ThreadGroup b = new ThreadGroup("b");

        Thread one = new Thread(a,new MyThread());
        Thread two = new Thread(a,new MyThread());
        Thread three = new Thread(a,new MyThread());
        Thread four = new Thread(b,new MyThread());
        Thread five = new Thread(b,new MyThread());
        one.start();
        two.start();
        three.start();
        four.start();
        five.start();

        for(;;){
            System.out.println("THREAD-A-" + a.activeCount());
            System.out.println("THREAD-B-" + b.activeCount());
            if(Thread.activeCount() == 1){
                break;
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
