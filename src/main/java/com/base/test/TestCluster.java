package com.base.test;

import java.util.HashMap;
import java.util.Map;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2019-01-10 14:52
 **/
public class TestCluster {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>(2);
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(map.get(entry.getKey()));
        }
    }
}
