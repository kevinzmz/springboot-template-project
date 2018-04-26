package com.base.pattern.singleton;

/**
 * <p>双检索/双重校验锁</p>
 *
 * 多线程下保持高性能
 * volatile：值修改保证立即可见
 *
 * @author kevin
 * @create 2018-04-25 14:17
 **/
public class SingletonDoubleCheck {
    private volatile static SingletonDoubleCheck singletonDoubleCheck;
    private SingletonDoubleCheck(){}

    public static SingletonDoubleCheck getSingletonDoubleCheck(){
        if(singletonDoubleCheck==null){
            synchronized (SingletonDoubleCheck.class){
                if(singletonDoubleCheck==null){
                    singletonDoubleCheck = new SingletonDoubleCheck();
                }
            }
        }
       return singletonDoubleCheck;
    }
}
