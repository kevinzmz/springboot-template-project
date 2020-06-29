package com.base.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther kevin
 * @date 2020/6/17 14:12
 */
public class TestList {
    public static void main(String[] args) {
        List<List> temp = new ArrayList<>();
        System.out.println(temp.size());
        if(temp.size()==0 || temp.get(0) == null){
            List tempList = new ArrayList();
            temp.add(tempList);
        }
        System.out.println(temp.size());
        if(temp.get(0) == null){
            temp.add(new ArrayList());
        }
        System.out.println(temp.size());
    }
}
