package com.base.utils.prototypePattern;

/**
 * <P></P>
 * Created by kevin on 2017/9/4 16:41.
 */
public class Square extends Shape{
    public Square(){
        type = "Square";
    }
    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
