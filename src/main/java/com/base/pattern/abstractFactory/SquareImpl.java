package com.base.pattern.abstractFactory;

/**
 * <p>形状实现->正方形</p>
 *
 * @author kevin
 * @create 2018-04-25 11:21
 **/
public class SquareImpl implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw abstract square！");
    }
}
