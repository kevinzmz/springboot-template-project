package com.base.test;

/**
 * @auther kevin
 * @date 2020/1/9 15:14
 */
public class TestInnerClass {
    public TestAbstract wrap(){
        return new TestAbstract(){
            private int i = 11;
            public int value(){
                return i;
            }
        };
    }

    public TestAbstract sec(){
        return new TestAbstract(){
            private int i = 11;
            public int value(){
                return i;
            }
        };
    }

    public static void main(String[] args) {
        /*
            jlfjlsdjf
         */
        TestInnerClass t = new TestInnerClass();
        TestAbstract c = t.wrap();

        System.out.println(String.valueOf(c.value()));
    }
}
