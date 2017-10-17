package com.base.utils.factoryPattern;

/**
 * <P></P>
 * Created by kevin on 2017/9/11 17:28.
 */
public class FactoryPatternDemo {
    public static void main(String []args){
        Rectangle rectangle = (Rectangle) ShapeFactory.getClass(Rectangle.class);
        rectangle.draw();
        Square square = (Square) ShapeFactory.getClass(Square.class);
        square.draw();
    }
}
