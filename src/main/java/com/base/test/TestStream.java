package com.base.test;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * @auther kevin
 * @date 2020/7/16 15:57
 */
public class TestStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        list.stream().peek(s-> System.out.println(s)).forEach(a-> System.out.println(a+"--"));

        System.out.println("==============================");

        Stream.of(list).peek(s -> System.out.println(s + "++")).forEach(a->{
            System.out.println(a + "------------");
        });

    }

    private static void sout(List<String> strings) {
        System.out.println(JSON.toJSONString(strings));
    }
}
