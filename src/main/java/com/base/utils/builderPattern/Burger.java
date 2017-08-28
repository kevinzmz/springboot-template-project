package com.base.utils.builderPattern;

import java.math.BigDecimal;

/**
 * <P></P>
 * Created by kevin on 2017/8/28 10:53.
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing(){
        return new Wrapper();
    }
    @Override
    public abstract double price();
}
