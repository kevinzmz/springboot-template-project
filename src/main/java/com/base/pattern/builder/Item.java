package com.base.pattern.builder;

/**
 * <p>食物条目和食物包装的接口</p>
 *
 * @author kevin
 * @create 2018-04-26 10:04
 **/
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
