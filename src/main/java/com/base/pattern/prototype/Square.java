package com.base.pattern.prototype;

/**
 * <p>正方形</p>
 *
 * @author kevin
 * @create 2018-04-26 10:51
 **/
public class Square extends Shape{
    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square:draw() method");
    }
}
