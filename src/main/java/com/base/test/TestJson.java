package com.base.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.base.model.TestObj;
import com.base.model.TestObjThree;
import com.base.model.User;
import com.base.model.UserSec;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-01-30 11:21
 **/
public class TestJson {
    public static void testJson(TestObj testObj){
        System.out.println(JSON.toJSONString(testObj));
    }

    public void test(TestObj testObj){
        System.out.println(JSON.toJSONString(testObj));
    }

    public static void testTypeReference(){
        List<TestObjThree<User>> a = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setEmail("aaaa");
        List<User> users = new ArrayList<>();
        users.add(user);

        TestObjThree<User> testObjThree = new TestObjThree<>();
        testObjThree.setId("11");
        testObjThree.setUserList(users);

        a.add(testObjThree);

        String testStr = JSON.toJSONString(a);
        System.out.println(testStr);

        List<TestObjThree<UserSec>> b = JSON.parseObject(testStr,new TypeReference<List<TestObjThree<UserSec>>>(){});

        String testStrSec = JSON.toJSONString(b);

        System.out.println(testStrSec);
    }

    public static void main(String[] args) {
        testJson(null);

        String a = null;
        JSON.parseObject(a,TestObj.class);

        String b = "";
        JSON.parseObject(a,TestObj.class);

        List c = null;
        System.out.println();

        testTypeReference();

    }
}
