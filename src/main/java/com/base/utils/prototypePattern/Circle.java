package com.base.utils.prototypePattern;

/**
 * <P></P>
 * Created by kevin on 2017/9/4 16:43.
 */
public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
