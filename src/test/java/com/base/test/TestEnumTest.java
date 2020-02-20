package com.base.test;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestEnumTest {

    @Autowired
    private TestEnum testEnum;

    @Test(groups = {"functiontest"})
    public void testGetValue() {
       int result = testEnum.A.getValue();
        Assert.assertNotNull(result);
        Assert.assertEquals(result,2);
    }

    @Test
    public void testGetCha() {
    }

    @Test
    public void testGetThi() {
    }

    @Test
    public void testGetInstance() {
    }
}