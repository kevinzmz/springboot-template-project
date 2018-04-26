package com.base.pattern.prototype;

import java.util.Hashtable;

/**
 * <p>对象缓存类</p>
 *
 * @author kevin
 * @create 2018-04-26 10:53
 **/
public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeMap.put(rectangle.getId(),rectangle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

    }
}

