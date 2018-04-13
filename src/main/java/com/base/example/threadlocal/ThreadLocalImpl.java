package com.base.example.threadlocal;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>ThreadLocal实现</p>
 *
 * @author kevin
 * @create 2018-04-11 13:46
 **/
public class ThreadLocalImpl {
    /**
     * 所有线程共享一个初始值
     */
    private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {
        @Override
        public Integer initialValue() {
            return 0;
        }
    };

    private static ThreadLocal<List> threadLocal = new ThreadLocal<List>(){
        @Override
        public List initialValue(){
            return null;
        }
    };

    public int getNextNum() {
        seqNum.set(seqNum.get() + 1);
        return seqNum.get();
    }

    public List getObject(String a) {
        if(threadLocal.get()==null){
            setObjcet(a);
        }
        return threadLocal.get();
    }

    public void setObjcet(String b) {
        Date d = new Date();
        String dStr = d.toString() + "--" + b;
        List objList = new ArrayList<String>();
        objList.add(dStr);
        threadLocal.set(objList);
    }

    private static class TestClient extends Thread {
        private ThreadLocalImpl th;

        public TestClient(ThreadLocalImpl th) {
            this.th = th;
        }

        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("thread[" + Thread.currentThread().getName() + "] th[" + th.getNextNum() + "]");
            }

            for(int i = 0; i < 2; i++){
                System.out.println(JSON.toJSONString(th.getObject(Double.toString(Math.random()))));
            }
        }
    }

    public static void main(String[] args) {
        ThreadLocalImpl threadLocalImpl = new ThreadLocalImpl();

        TestClient t1 = new TestClient(threadLocalImpl);
        TestClient t2 = new TestClient(threadLocalImpl);
        TestClient t3 = new TestClient(threadLocalImpl);
        t1.start();
        t2.start();
        t3.start();
    }
}
