package com.base.pattern.Factory;

/**
 * <p>正方形实现形状</p>
 *
 * @author kevin
 * @create 2018-04-25 10:35
 **/
public class SquareImpl implements Shape{
    @Override
    public void draw() {
        System.out.println("draw square!");
    }
}
