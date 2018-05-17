package com.base.example.produceAndConsume;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-17 13:56
 **/
public class Consumer implements Runnable {

    public void get() throws InterruptedException {
        /*
            判断仓库是否有货物
         */
        if (MyQueue.getQueueList().size() == 0) {
            System.out.println("消费者等待");
            MyQueue.queueWait();
        } else {
            /*
                增加消费计数
             */
            int count = MyQueue.getConOperCount() + 1;
            MyQueue.setConOperCount(count);
            /*
                消费
             */
            System.out.println("消费："+MyQueue.getQueueList().remove(0) + ", 消费数："+count);
            /*
                等待，用于唤醒时和生产者公平竞争
             */
            MyQueue.queueWaitTime(1);
        }
    }

    @Override
    public void run() {
        try {
            /*
                按照指定的量进行消费
             */
            while (MyQueue.getConOperCount()< MyQueue.getCycleCount()) {
                /*
                    将仓库添加到线程监视器
                 */
                synchronized (MyQueue.getQueueList()) {
                    get();
                    /*
                        随机唤醒生产者或消费者
                     */
                    MyQueue.queueNotifyAll();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
