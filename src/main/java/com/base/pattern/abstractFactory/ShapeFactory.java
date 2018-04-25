package com.base.pattern.abstractFactory;

/**
 * <p>抽象工厂实现类</p>
 *
 * @author kevin
 * @create 2018-04-25 11:28
 **/
public class ShapeFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("R")){
            return new RectangleImpl();
        }else if(shapeType.equalsIgnoreCase("S")){
            return new SquareImpl();
        }
        return null;
    }
}
