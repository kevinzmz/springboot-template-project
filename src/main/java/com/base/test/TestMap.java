package com.base.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kevin
 * @version V1.0
 * @Description: TODO
 * @date 2019/8/22 12:52
 **/
public class TestMap {
    public static void main(String[] args) {
        Map<Integer,Integer> test = new HashMap<>();
        test.put(1,null);

        for(Map.Entry<Integer,Integer> entry : test.entrySet()){
            System.out.println(entry);
            if(entry.getValue()!=null && entry.getValue() >= 10){
                System.out.println(entry.getKey());
            }
        }
    }
}

