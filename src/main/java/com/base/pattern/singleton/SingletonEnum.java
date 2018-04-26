package com.base.pattern.singleton;

/**
 * <p>枚举实现单例</p>
 *
 * 支持序列化
 *
 * @author kevin
 * @create 2018-04-25 14:44
 **/
public enum SingletonEnum {
    instance;

    public void handleMethod(){
        System.out.println("处理方法");
    }
}
