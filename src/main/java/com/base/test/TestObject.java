package com.base.test;

import com.alibaba.fastjson.JSON;
import com.base.model.TestObj;

/**
 * TestObject
 *
 * @author kevin
 * @version 1.0
 * @date 2020/11/27 10:26
 */
public class TestObject {
    public static void main(String[] args) {
        TestObj testObjOne = new TestObj();
        testObjOne.setId("1");
        testObjOne.setBusinessType(2);

        TestObj testObjTwo = new TestObj();
        testObjTwo.setBusinessType(2);
        testObjTwo.setId("1");

        System.out.println(JSON.toJSONString(testObjOne).hashCode() == JSON.toJSONString(testObjTwo).hashCode());
        System.out.println(testObjOne.hashCode() == testObjTwo.hashCode());
        System.out.println(testObjOne.equals(testObjTwo));
    }
}
