package com.base.utils.builderPattern;

/**
 * <P></P>
 * Created by kevin on 2017/8/28 11:01.
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public double price() {
        return 25.00;
    }
}
