package com.base.pattern.Proxy;

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

        Image image = new ProxyImage("test_10mb.jpg");

        image.display();

        System.out.println("--------------------------------");

        /*
         * 动态代理
         */
        Image visitor = new DynamicProxy("test_10mb.jpg").getInstance();
        System.out.println(visitor.display());
    }
}
