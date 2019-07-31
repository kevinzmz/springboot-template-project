package com.base.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 测试数学函数
 *
 * @author
 * @create 2017-12-29 15:21
 **/
public class TestMath {
    public static void main(String[] args) {
        BigDecimal one = new BigDecimal(1);
        BigDecimal two = new BigDecimal(5000);
        System.out.println((int)Math.ceil(Double.valueOf(one.divide(two).toString())));

        BigDecimal test = new BigDecimal("37.3373842");
        System.out.println(test.setScale(2,BigDecimal.ROUND_HALF_UP));

    }
}
