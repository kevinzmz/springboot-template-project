package com.base.jvm;

import java.util.HashSet;
import java.util.Set;

/**
 * vm args: -Xmx6m
 * @auther kevin
 * @date 2020/4/8 17:30
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        /*Set<String> set = new HashSet<>();
        short i = 0;
        while(true){
            set.add(String.valueOf(i).intern());
        }*/
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);
        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
        System.out.println(str2.intern());
        System.out.println(str2);
    }
}
