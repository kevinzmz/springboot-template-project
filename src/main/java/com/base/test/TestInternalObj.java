package com.base.test;

import java.util.HashMap;
import java.util.Map;

/**
 * <P></P>
 * Created by kevin on 2017/8/15 18:50.
 */
public class TestInternalObj {
   /* public void testInternalObj(){
        TimeInfoBean testBean = new TimeInfoBean();
        testBean.setA("sadfwsarwerwerw");
        operData(testBean);
        System.out.println(testBean.getA()+"+++++++++++++++");
    }
   public void operData(TimeInfoBean a){
       a.setA(a.getA().substring(0,5));
       System.out.println(a.getA());
   }*/
    public static void main(String []args){
     /*   TestInternalObj testInternalObj = new TestInternalObj();
        testInternalObj.testInternalObj();*/
     Map<Integer,String> map = new HashMap<Integer,String>();
     map.put(Integer.valueOf(0),"aaa");
     map.put(Integer.valueOf(1),"bbb");
     map.put(Integer.valueOf(2),"ccc");

     int i=0;
     for(;i<3;){
      System.out.println(map.get(i));
      i++;
     }
    }
}
