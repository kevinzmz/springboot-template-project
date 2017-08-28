package com.base.test;

import java.util.ArrayList;
import java.util.List;

/**
 * <P></P>
 * Created by kevin on 2017/8/14 15:06.
 */
public class TestLambda {
    public void testLambda(){
      /*  List<String> list = new ArrayList<String>();
        list.add("sfsadfwerwerw");
        list.add("12345678");
        list.add("98765");
        Stream<String> stringStream;
        list.stream().filter(a -> a.length() == 8).forEach(b->System.out.println(b.substring(0,5)));
        list.forEach(c->System.out.println(c));

        Collator myCollator = Collator.getInstance();*/
        List<String> list = new ArrayList<String>();
        list.stream().forEach(o->System.out.println(o));

    }
    public static void main(String []args){
        TestLambda testLambda = new TestLambda();
        testLambda.testLambda();
    }
}
