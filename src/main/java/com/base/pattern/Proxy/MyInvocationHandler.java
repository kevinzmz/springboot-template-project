package com.base.pattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <p>JDK动态代理</p>
 *
 * @author kevin
 * @create 2018-04-08 16:24
 **/
public class MyInvocationHandler implements InvocationHandler{
    private Object target;

    MyInvocationHandler(){
        super();
    }

    MyInvocationHandler(Object target){
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /*
            对方法和参数做切面拦截
         */
        Object result = method.invoke(target,args);
        return result;
    }
}
