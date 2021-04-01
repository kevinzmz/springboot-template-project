package com.base.test;

import com.alibaba.fastjson.JSON;
import com.base.model.TestObj;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <P></P>
 * Created by kevin on 2017/8/14 15:06.
 */
public class TestLambda {
    public static void testLambda(){
        List<String> list = new ArrayList<String>();
        list.add("sfsadfwerwerw");
        list.add("12345678");
        list.add("98765");
        list.add(null);
        list.stream().filter(a -> a != null).forEach(b->System.out.println(b.toString()));

    }

    public static void testLambdaAbnormalParam(){
        TestObj testObjOne = new TestObj();
        testObjOne.setId("1");
        testObjOne.setCheckBalanceFkag("aaa");

        TestObj testObjTwo = new TestObj();
        testObjTwo.setId(null);
        testObjTwo.setCheckBalanceFkag("bbb");

        TestObj testObjThree = null;

        List<TestObj> list = new ArrayList<TestObj>();
        list.add(testObjOne);
        list.add(testObjTwo);
        list.add(testObjThree);

        Map<String,TestObj> map = new HashMap<String,TestObj>();

        if(list!=null){
            list.parallelStream().filter(a->a!=null).filter(b->b.getId()!=null).forEach(c->{c.setBusinessType(1232131231);map.put(c.getId(),c);});
        }

        map.put(null,null);
        map.put("a",null);
        //map.put(null,testObjOne);

        map.values().stream().filter(a->a!=null).forEach(b->System.out.println(JSON.toJSONString(b)));
        System.out.println("-------------");
        map.values().stream().filter(a->a!=null).forEach(TestObj::toString);
        System.out.println("-------------");
    }

    public static void testMap(){
        List<TestObj> test = new ArrayList<>();

        test.stream().collect(Collectors.toMap(a->a.getDate()+String.valueOf(a.getTestInt()),b->b));
    }

    public static void main(String []args){
        testLambdaAbnormalParam();
    }
}
