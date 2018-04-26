package com.base.pattern.singleton;

/**
 * <p>饿汉式单例</p>
 *
 * @author kevin
 * @create 2018-04-25 13:57
 **/
public class SingletonHangury {
    private static SingletonHangury singletonHangury = new SingletonHangury();
    private SingletonHangury(){}

    public static SingletonHangury getInstance(){
        return singletonHangury;
    }
}
