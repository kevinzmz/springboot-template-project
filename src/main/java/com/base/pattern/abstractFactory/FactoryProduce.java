package com.base.pattern.abstractFactory;

/**
 * <p>工厂创造器</p>
 *
 * @author kevin
 * @create 2018-04-25 11:37
 **/
public class FactoryProduce {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("S")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("C")){
            return new ColorFactory();
        }
        return null;
    }
}
