package com.base.pattern.builder;

/**
 * <p>汉堡-》食物条目抽象类</p>
 *
 * @author kevin
 * @create 2018-04-26 10:09
 **/
public abstract  class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
