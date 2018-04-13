package com.base.example.threadlocal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>ThreadLocal模拟类</p>
 *
 * 模拟ThreadLocal的实现
 * @author kevin
 * @create 2018-04-11 13:34
 **/
public class SimpleThreadLocal {
    //存储线程内变量，key:Thread.currentThread();  value:Object
    private Map valueMap = Collections.synchronizedMap(new HashMap());

    public  void set(Object newValue){
        valueMap.put(Thread.currentThread(),newValue);
    }

    public Object get(){
        Thread currentThread = Thread.currentThread();
        Object o = valueMap.get(currentThread);

        if(o == null && !valueMap.containsKey(currentThread)){
            o = initialValue();
            valueMap.put(currentThread,o);
        }
        return o;
    }

    public void remove(){
        valueMap.remove(Thread.currentThread());
    }

    public Object initialValue(){
        return null;
    }
}
