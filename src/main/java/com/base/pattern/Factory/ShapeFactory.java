package com.base.pattern.Factory;

/**
 * <p>形状工厂</p>
 *
 * @author kevin
 * @create 2018-04-25 10:42
 **/
public class ShapeFactory {
    public static Shape getShape(String shapeName){
        if("R".equals(shapeName)){
            return new RectangleImpl();
        }else if("S".equals(shapeName)){
            return new SquareImpl();
        }else{
            return null;
        }
    }
}
