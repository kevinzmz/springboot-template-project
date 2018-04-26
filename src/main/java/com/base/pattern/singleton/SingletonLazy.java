package com.base.pattern.singleton;

/**
 * <p>懒汉式单例</p>
 *
 * @author kevin
 * @create 2018-04-25 13:53
 **/
public class SingletonLazy {
    private SingletonLazy(){}

    private static SingletonLazy singletonLazy;

    public static synchronized SingletonLazy getInstance() {
        if(singletonLazy==null){
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
