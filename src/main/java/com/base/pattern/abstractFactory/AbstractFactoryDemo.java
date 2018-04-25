package com.base.pattern.abstractFactory;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-04-25 11:40
 **/
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory a1 = FactoryProduce.getFactory("s");
        Shape s1 = a1.getShape("s");
        s1.draw();
        Shape s2 = a1.getShape("R");
        s2.draw();

        AbstractFactory a2 = FactoryProduce.getFactory("C");
        Color c1 = a2.getColor("R");
        c1.showColor();
        Color c2 = a2.getColor("B");
        c2.showColor();
    }
}
