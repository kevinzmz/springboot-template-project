package com.base.example.produceAndConsume;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-17 13:53
 **/
public class MyQueue {
    private static List<String> queueList = Collections.synchronizedList(new ArrayList<String>());

    public static List<String> getQueueList() {
        return queueList;
    }

    public static void queueWait(){
        try {
            queueList.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (IllegalMonitorStateException m){
            m.printStackTrace();
        }
    }

    public static void queueWaitTime(int time){
        try {
            queueList.wait(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (IllegalMonitorStateException m){
            m.printStackTrace();
        }
    }

    public static void queueNotify(){
        try{
            queueList.notifyAll();
        }catch (IllegalMonitorStateException m){
            m.printStackTrace();
        }
    }
}
