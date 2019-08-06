package com.base.test;

/**
 * @author kevin
 * @version V1.0
 * @Description: TODO
 * @date 2019/8/6 11:12
 **/
public class Outer {
    class Inner {
        //int t1 = 100; //编译错误
        static final int t2 = 100; //编译成功
        //final int t3 = new Integer(100); //编译错误
    }

    public static void main(String[] args) {
        //System.out.println(Outer.Inner.t1);
        System.out.println(Outer.Inner.t2);
        //System.out.println(Outer.Inner.t3);
    }
}
