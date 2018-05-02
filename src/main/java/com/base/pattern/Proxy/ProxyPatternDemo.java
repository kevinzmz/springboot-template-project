package com.base.pattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <p>代理类调用类</p>
 *
 * @author kevin
 * @create 2018-04-08 16:08
 **/
public class ProxyPatternDemo {
    public static void main(String[] args) {
        /*
         *   静态代理
         */

        Image image = new ProxyImage(" test_10mb.jpg");

        image.display();

        System.out.println("--------------------------------");

        /*
         * 动态代理
         */
        Image imageReal = new RealImage(" fileName");
        InvocationHandler invocationHandler = new MyInvocationHandler(imageReal);
        //Image imageProxy = (Image) Proxy.newProxyInstance(imageReal.getClass().getClassLoader(),new Class[]{Image.class},invocationHandler);
        Image imageProxy = (Image) Proxy.newProxyInstance(imageReal.getClass().getClassLoader(),imageReal.getClass().getInterfaces(),invocationHandler);
        imageProxy.display();
    }
}
