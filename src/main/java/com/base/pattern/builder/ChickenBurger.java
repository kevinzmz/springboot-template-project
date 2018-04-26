package com.base.pattern.builder;

/**
 * <p>鸡肉汉堡</p>
 *
 * @author kevin
 * @create 2018-04-26 10:18
 **/
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
