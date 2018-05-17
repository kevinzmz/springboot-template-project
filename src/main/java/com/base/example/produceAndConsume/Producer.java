package com.base.example.produceAndConsume;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-17 13:52
 **/
public class Producer implements Runnable {

    public void put() throws InterruptedException {
        /*
            判断是否超过了最大库存数
         */
        if (MyQueue.getQueueList().size() == MyQueue.getMaxStorageCount()) {
            System.out.println("生产者等待");
            MyQueue.queueWait();
        } else {
            /*
                增加生产者消费次数
             */
            int count = MyQueue.getProOperCount() + 1;
            MyQueue.setProOperCount(count);
            /*
                生产
             */
            String str = String.valueOf(Math.random());
            MyQueue.getQueueList().add(str);
            System.out.println("生产：" + str + ", 生产数："+count);
            /*
                等待，用于唤醒时和消费者公平竞争
             */
            MyQueue.queueWaitTime(1);
        }
    }

    @Override
    public void run() {
        try {
            /*
                按照指定的量进行生产
             */
            while (MyQueue.getProOperCount()< MyQueue.getCycleCount()) {
                /*
                    将仓库添加到线程监视器
                 */
                synchronized (MyQueue.getQueueList()) {
                    put();
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
