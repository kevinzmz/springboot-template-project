package com.base.test;

import org.codehaus.groovy.runtime.powerassert.SourceText;

public class TestMultiClass {
    public static void main(String[] args) {
        TestSuper testSuper = new TestSuper();
        TestOneLevelOne testOneLevelOne = new TestOneLevelOne();
        testSuper = testOneLevelOne;
        System.out.println(TestSuper.getA());
    }
}
