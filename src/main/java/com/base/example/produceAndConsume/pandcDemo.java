package com.base.example.produceAndConsume;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-17 14:23
 **/
public class pandcDemo {
    public static void main(String[] args) {
        Producer p =  new Producer();
        Consumer c = new Consumer();
        Thread pro = new Thread(p);
        Thread con = new Thread(c);
        pro.start();
        con.start();

        BlockingQueue b = new ArrayBlockingQueue(10);
    }
}
