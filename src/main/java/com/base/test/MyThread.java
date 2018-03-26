package com.base.test;

import static java.lang.Thread.sleep;

/**
 * <p>Thread测试interrupt</p>
 *
 * @author kevin
 * @create 2018-03-22 13:49
 **/
public class MyThread implements Runnable{
    @Override
    public void run(){
        System.out.println("线程开始");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("异常----"+e.getMessage());
        }
    }
}
