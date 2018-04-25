package com.base.pattern.Factory;

/**
 * 工厂模式两种实现
 * 入参指定特定对象
 * 枚举指定特定对象
 * @Author kevin
 * @Date 2018-04-25
 */
public class FactoryDemo {
    public static void main(String[] args) {
        Shape shapeOne = ShapeFactory.getShape("R");
        shapeOne.draw();

        Shape shapeTwo = ShapeFactory.getShape("S");
        shapeTwo.draw();

        Shape shapeThree = ShapeSecFactory.RECTANGLE.getShape();
        shapeThree.draw();

        Shape shapeFour = ShapeSecFactory.SQUARE.getShape();
        shapeFour.draw();

    }
}
