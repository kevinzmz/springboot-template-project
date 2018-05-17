package com.base.example.produceAndConsume;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-17 13:52
 **/
public class Producer implements Runnable {
    private volatile static int count = 0;

    public void put() throws InterruptedException {
        if (MyQueue.getQueueList().size() == 10) {
            System.out.println("生产者等待");
            MyQueue.queueWait();
        } else {
            count++;
            String str = String.valueOf(Math.random());
            MyQueue.getQueueList().add(str);
            System.out.println("生产：" + str + ", 生产数："+count);
            MyQueue.queueWaitTime(1);
        }
    }

    @Override
    public void run() {
        try {
            while (count < 30) {
                synchronized (MyQueue.getQueueList()) {
                    put();
                    MyQueue.queueNotify();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
