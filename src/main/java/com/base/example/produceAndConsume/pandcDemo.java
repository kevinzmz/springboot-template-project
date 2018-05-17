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
        MyQueue.setCycleCount(100);
        /*
            设置最大库存
         */
        MyQueue.setMaxStorageCount(1);

        Thread proOne = new Thread(new Producer());
        Thread proTwo = new Thread(new Producer());
        Thread proThree = new Thread(new Producer());
        Thread conOne = new Thread(new Consumer());
        Thread conTwo = new Thread(new Consumer());
        proOne.start();
        proTwo.start();
        proThree.start();
        conOne.start();
        conTwo.start();
    }
}
