package com.base.test;

/**
 * @auther kevin
 * @date 2020/6/9 10:33
 */
public class TestExc {
    public static int inc() {
        int x;
        try {
            x = 1;
            return x;
        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
            //return x;
        }
        //return x;
    }

    public static void main(String[] args) {
        System.out.println(inc());
    }
}
