package com.base.pattern.builder;

/**
 * <p>蔬菜汉堡</p>
 *
 * @author kevin
 * @create 2018-04-26 10:16
 **/
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
