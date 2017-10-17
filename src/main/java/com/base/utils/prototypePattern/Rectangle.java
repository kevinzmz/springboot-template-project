package com.base.utils.prototypePattern;

/**
 * <P></P>
 * Created by kevin on 2017/9/4 16:38.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
