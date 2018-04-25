package com.base.pattern.abstractFactory;

/**
 * <p>抽象工厂</p>
 *
 * @author kevin
 * @create 2018-04-25 11:26
 **/
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
