package com.base.test;

/**
 * @author kevin
 * @version V1.0
 * @Description: TODO
 * @date 2019/9/19 17:26
 **/
public class TestBit {
    public static void main(String[] args) {
        String a = "1010011";
        String b = "1001100";

        System.out.println(Integer.parseInt(a,2)|Integer.parseInt(b,2));

        float c = 0.000000000000000000000000000000000000000000001f;

        System.out.println(c);

        System.out.println(1.4E-300);

    }
}
