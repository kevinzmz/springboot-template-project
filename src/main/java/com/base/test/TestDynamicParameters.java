package com.base.test;

import com.alibaba.fastjson.JSON;
import com.base.model.TestObj;

import java.lang.reflect.Method;

/**
 * 测试动态参数
 *
 * @author
 * @create 2018-01-02 10:28
 **/
public class TestDynamicParameters {
    public static String setDynamicParameters(String className,String methodName,Object... a) throws Exception {
        Object paramStr = JSON.toJSON(a);
        Method method = Class.forName(className).getMethod(methodName,Object.class);
        Class c = Class.forName(className);
        Object obj = c.newInstance();

        String result = null;
        result = JSON.toJSONString(method.invoke(obj,paramStr));

        return result;
    }

    /**
     * 处理参数
     */
    public String handlerParam(Object a){
        return JSON.toJSONString(a);
    }

    public static void main(String[] args) throws Exception {
        Integer a = new Integer(0);
        String b = "bbb";

        TestObj testObj = new TestObj();
        testObj.setTestId("000000000000000");
        testObj.setCheckBalanceFkag("0");
        testObj.setId("as9asd0f");

        System.out.println(setDynamicParameters("com.base.test.TestDynamicParameters","handlerParam",a,null,b,testObj));
    }
}
