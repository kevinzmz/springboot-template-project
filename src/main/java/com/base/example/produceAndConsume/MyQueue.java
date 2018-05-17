package com.base.example.produceAndConsume;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 *     仓库同一时间只能保证只有一个生产者或消费者
 * </p>
 *
 * @author kevin
 * @create 2018-05-17 13:53
 **/
public class MyQueue {
    /**
     * 定义链表作为仓库
     */
    private static List<String> queueList = Collections.synchronizedList(new ArrayList<String>());

    /**
     *  循环次数
     */
    private volatile static int cycleCount = 30;

    /**
     *  生产者操作次数
     */
    public volatile static int proOperCount = 0;

    /**
     *  消费者操作次数
     */
    public volatile static int conOperCount = 0;

    /**
     *  仓库最大库存
     */
    public volatile static int maxStorageCount = 1;

    /**
     * 获取仓库对象
     * @return
     */
    public static List<String> getQueueList() {
        return queueList;
    }

    /**
     * 基于仓库对象当前线程等待
     */
    public static void queueWait(){
        try {
            queueList.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (IllegalMonitorStateException m){
            m.printStackTrace();
        }
    }

    /**
     * 基于仓库对象当前线程指定时间等待
     * @param time
     */
    public static void queueWaitTime(int time){
        try {
            queueList.wait(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (IllegalMonitorStateException m){
            m.printStackTrace();
        }
    }

    /**
     * 基于仓库对象唤醒所有线程
     */
    public static void queueNotifyAll(){
        try{
            queueList.notifyAll();
        }catch (IllegalMonitorStateException m){
            m.printStackTrace();
        }
    }

    public static int getCycleCount() {
        return cycleCount;
    }

    public static void setCycleCount(int cycleCount) {
        MyQueue.cycleCount = cycleCount;
    }

    public static int getMaxStorageCount() {
        return maxStorageCount;
    }

    public static void setMaxStorageCount(int maxStorageCount) {
        MyQueue.maxStorageCount = maxStorageCount;
    }

    public static int getProOperCount() {
        return proOperCount;
    }

    public synchronized static void setProOperCount(int proOperCount) {
        MyQueue.proOperCount = proOperCount;
    }

    public static int getConOperCount() {
        return conOperCount;
    }

    public synchronized static void setConOperCount(int conOperCount) {
        MyQueue.conOperCount = conOperCount;
    }
}
