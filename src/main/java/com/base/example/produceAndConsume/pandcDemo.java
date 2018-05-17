package com.base.example.produceAndConsume;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-17 14:23
 **/
public class pandcDemo {
    public static void main(String[] args) {
        /*
            设置循环次数
         */
        MyQueue.setCycleCount(40);
        /*
            设置最大库存
         */
        MyQueue.setMaxStorageCount(1);

        Producer p = new Producer();
        Consumer c = new Consumer();
        Thread pro = new Thread(p);
        Thread con = new Thread(c);
        pro.start();
        con.start();
    }
}
