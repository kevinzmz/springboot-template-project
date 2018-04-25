package com.base.pattern.abstractFactory;

/**
 * <p>形状实现->矩形</p>
 *
 * @author kevin
 * @create 2018-04-25 11:19
 **/
public class RectangleImpl implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw abstract rectangle!");
    }
}
