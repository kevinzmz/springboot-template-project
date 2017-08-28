package com.base.utils.builderPattern;

/**
 * <P></P>
 * Created by kevin on 2017/8/28 10:59.
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing(){
        return new Bottle();
    }
    public abstract double price();
}
