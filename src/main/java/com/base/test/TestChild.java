package com.base.test;

/**
 * <p>测试代理</p>
 *
 * @author kevin
 * @create 2018-02-05 10:41
 **/
public class TestChild extends TestFather{
    @Override
    public void showOut(String a){
        System.out.println("ChildOne tier:"+a);
    }
}
