package com.base.utils.builderPattern;

/**
 * <P></P>
 * Created by kevin on 2017/8/28 11:02.
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public double price() {
        return 50.10;
    }
}
