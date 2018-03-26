package com.base.test;

/**
 * <p>测试Thread</p>
 *
 * @author kevin
 * @create 2018-03-22 13:49
 **/
public class TestThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();
        thread.interrupt();
    }
}
