package com.base.utils.builderPattern;

/**
 * <P></P>
 * Created by kevin on 2017/8/28 11:04.
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 35.00;
    }
}
