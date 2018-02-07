package com.base.test;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-02-01 11:00
 **/
public class TestClassLoad {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        System.out.println(classLoader);

        System.out.println(classLoader.getParent());

        System.out.println(classLoader.getParent().getParent());
    }
}
