package com.base.test;

import com.alibaba.fastjson.JSON;
import com.base.model.TestObj;

import java.util.List;

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

    public void test(TestObj testObj){
        System.out.println(JSON.toJSONString(testObj));
    }

    public static void main(String[] args) {
        testJson(null);

        String a = null;
        JSON.parseObject(a,TestObj.class);

        String b = "";
        JSON.parseObject(a,TestObj.class);

        List c = null;
        System.out.println();

    }
}
