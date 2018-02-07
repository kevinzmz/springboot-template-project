package com.base.test;

import com.alibaba.fastjson.JSON;
import com.base.model.TestObj;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-01-30 11:21
 **/
public class TestJson {
    public static void testJson(TestObj testObj){
        System.out.println(JSON.toJSONString(testObj));
    }

    public static void main(String[] args) {
        testJson(null);
    }
}
