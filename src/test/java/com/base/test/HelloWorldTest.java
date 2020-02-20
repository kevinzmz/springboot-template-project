package com.base.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {

    @Test(groups = {"systemtest"})
    public void testHello() {
        HelloWorld hello = new HelloWorld();
        String result = hello.hello();

        Assert.assertNotNull(result);
        Assert.assertEquals(result,"Hello world");
    }
}