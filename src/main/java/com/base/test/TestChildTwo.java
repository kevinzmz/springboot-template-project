package com.base.test;

/**
 * <p>测试代理</p>
 *
 * @author kevin
 * @create 2018-02-05 11:03
 **/
public class TestChildTwo extends TestFather{
    private static TestFather testFather = new TestChild();

    @Override
    public void showOut(String a){
        super.showOut("testTwo");
        testFather.showOut("TestTwo");
    }

    public static void main(String[] args) {
        TestFather test = new TestChildTwo();
        test.showOut("test");
    }
}
