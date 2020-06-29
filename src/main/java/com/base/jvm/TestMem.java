package com.base.jvm;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @auther kevin
 * @date 2020/6/15 10:29
 */

public class TestMem {
    public static void main(String[] args) throws InterruptedException {
        {
            int n = 0;
            System.out.println(n);
        }
        {
            int n = 1;
            System.out.println(n);
        }
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
            Arrays.sort(placeholder);
        }
        System.gc();
        Thread.sleep(10l);
    }
}
