package com.base.test.one;

/**
 * @auther kevin
 * @date 2020/6/22 14:32
 */
public class TestAccesss extends TestProtect{
    public static void main(String[] args) throws ClassNotFoundException {
        TestAccesss t = new TestAccesss();
        t.testProtected();
        t.testDefault();
        t.getClass().getClassLoader().loadClass("");
    }
}
