package com.base.pattern.builder;

/**
 * <p>饮料-》食物条目抽象类</p>
 *
 * @author kevin
 * @create 2018-04-26 10:13
 **/
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
