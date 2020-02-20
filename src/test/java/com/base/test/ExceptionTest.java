package com.base.test;

import org.testng.annotations.Test;

/**
 * @auther kevin
 * @date 2020/1/15 13:51
 */
public class ExceptionTest {

    @Test(expectedExceptions = IllegalArgumentException.class,expectedExceptionsMessageRegExp = "NullPoint")
    public void testException(){
        throw new IllegalArgumentException("NullPoint");
    }
}
