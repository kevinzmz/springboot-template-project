package com.base.test;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * @auther kevin
 * @date 2020/8/10 17:37
 */
public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(JSON.toJSONString(date.toString()));

        Date zeroDate = new Date("0000-00-00 00:00:00");
        System.out.println(zeroDate);
    }
}
