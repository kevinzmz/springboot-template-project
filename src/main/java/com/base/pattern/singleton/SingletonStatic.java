package com.base.pattern.singleton;

/**
 * <p>登记式/静态内部类</p>
 * 实现懒加载
 *
 * @author kevin
 * @create 2018-04-25 14:26
 **/
public class SingletonStatic {
    private static class SingletonHolder{
        private static final SingletonStatic  instance = new SingletonStatic();
    }

    private SingletonStatic(){}

    public SingletonStatic getInstance(){
        return SingletonHolder.instance;
    }
}
