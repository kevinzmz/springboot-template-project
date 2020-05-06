package com.base.test;

import com.base.model.TestObj;
import com.base.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther kevin
 * @date 2020/1/15 10:12
 */
public class HelloWorld {
    public String hello(){
        return "Hello world";
    }

    public static void main(String[] args) {
        TestObj test = new TestObj();
        List<User> list = new ArrayList<>();
        test.setUserList(list);

        System.out.println(test.getUserList().size());
    }
}
