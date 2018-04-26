package com.base.pattern.builder;

/**
 * <p>百事可乐</p>
 *
 * @author kevin
 * @create 2018-04-26 10:22
 **/
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
