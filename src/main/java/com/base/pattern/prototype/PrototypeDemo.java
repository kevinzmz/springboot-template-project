package com.base.pattern.prototype;

/**
 * <p>克隆类调用</p>
 *
 * @author kevin
 * @create 2018-04-26 10:58
 **/
public class PrototypeDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shapeOne = ShapeCache.getShape("1");
        System.out.println(shapeOne.getType());

        Shape shapeTwo = ShapeCache.getShape("2");
        System.out.println(shapeTwo.getType());
    }
}
