package com.base.test;

import com.alibaba.fastjson.JSON;
import com.base.model.TestObj;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kevin
 * @version V1.0
 * @Description: TODO
 * @date 2019/9/1 11:40
 **/
public class TestReflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class ObjClass = Class.forName("com.base.test.TestJson");
        System.out.println(ObjClass.getName());

        Method test =  ObjClass.getMethod("test",TestObj.class);
        test.invoke(ObjClass.newInstance(),new TestObj("1"));

        Method testStatic = ObjClass.getMethod("testJson", TestObj.class);
        testStatic.invoke(null,new TestObj("2"));

        ArrayList testArr = new ArrayList();
        testArr.add("1");

        List sec = (List) testArr.clone();
        System.out.println(JSON.toJSONString(sec));

    }
}
