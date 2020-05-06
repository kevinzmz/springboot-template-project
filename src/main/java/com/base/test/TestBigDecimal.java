package com.base.test;

import java.math.BigDecimal;

/**
 * @auther kevin
 * @date 2020/4/14 18:38
 */
public class TestBigDecimal {
    public static void main(String[] args) {
        BigDecimal one = new BigDecimal("10.02");
        System.out.println(one.intValue());
        System.out.println(one);
        System.out.println(one.doubleValue());
    }
}
