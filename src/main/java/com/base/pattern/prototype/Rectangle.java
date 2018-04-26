package com.base.pattern.prototype;

/**
 * <p>矩形</p>
 *
 * @author kevin
 * @create 2018-04-26 10:49
 **/
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle:draw() method");
    }
}
