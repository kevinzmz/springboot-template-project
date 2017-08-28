package com.base.utils.builderPattern;

/**
 * <P></P>
 * Created by kevin on 2017/8/28 11:03.
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public double price() {
        return 30.00;
    }
}
