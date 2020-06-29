package com.base.test.one;

/**
 * @auther kevin
 * @date 2020/6/22 14:25
 */
public class TestProtect {
    protected void testProtected(){
        System.out.println("test protected super");
    }

    void testDefault(){
        System.out.println("test default");
    }

    private void testPrivate(){
        System.out.println("test private");
    }
}
