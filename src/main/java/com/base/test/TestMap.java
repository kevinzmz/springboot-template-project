package com.base.test;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * @author kevin
 * @version V1.0
 * @Description: TODO
 * @date 2019/8/22 12:52
 **/
public class TestMap {
    public static void testMap(){
        Map<String,Map<String,Object>> mapMap = new HashMap<>();
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);

        Map<String,Object> map = new HashMap<>();
        map.put("a",a);
        map.put("2",a);

        Map<String,Object> map1 = new HashMap<>();
        map1.put("b",a);

        mapMap.put("c",map);
        mapMap.put("d",map1);

        System.out.println(JSON.toJSONString(mapMap));

        List<Map<String,Object>> listMap = new ArrayList<>();
        listMap.add(map);
        listMap.add(map1);
        System.out.println(JSON.toJSONString(listMap));

    }

    public static void main(String[] args) {
       /* Map<Integer,Integer> test = new HashMap<>();
        test.put(1,null);

        for(Map.Entry<Integer,Integer> entry : test.entrySet()){
            System.out.println(entry);
            if(entry.getValue()!=null && entry.getValue() >= 10){
                System.out.println(entry.getKey());
            }
        }

        Iterator iterator = test.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey());
        }*/

       testMap();

    }
}

