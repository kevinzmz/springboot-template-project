package com.base.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <P></P>
 * Created by kevin on 2017/8/16 16:39.
 */
public class MyInvocationHandler implements InvocationHandler{
    private Object proxied ;

    private MyInvocationHandler(Object obj){
        this.proxied = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(proxied,args);
        return result;
    }
    public static void main(String []args){
        ObjectInterface objectInterface = new RealObject();
        InvocationHandler invocationHandler = new MyInvocationHandler(objectInterface);
        ObjectInterface o = (ObjectInterface) Proxy.newProxyInstance(objectInterface.getClass().getClassLoader(),objectInterface.getClass().getInterfaces(),invocationHandler);
        o.drawPicture();

    }
}
