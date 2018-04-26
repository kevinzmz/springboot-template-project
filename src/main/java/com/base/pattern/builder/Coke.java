package com.base.pattern.builder;

/**
 * <p>可口可乐</p>
 *
 * @author kevin
 * @create 2018-04-26 10:21
 **/
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
