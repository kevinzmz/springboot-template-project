package com.base.example.produceAndConsume;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-17 13:56
 **/
public class Consumer implements Runnable {
    private volatile static int count = 0;

    public void get() throws InterruptedException {
        if (MyQueue.getQueueList().size() == 0) {
            System.out.println("消费者等待");
            MyQueue.queueWait();
        } else {
            count++;
            System.out.println("消费："+MyQueue.getQueueList().remove(0) + ", 消费数："+count);
            MyQueue.queueWaitTime(1);
        }
    }

    @Override
    public void run() {
        try {
            while (count < 30) {
                synchronized (MyQueue.getQueueList()) {
                    get();
                    MyQueue.queueNotify();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
