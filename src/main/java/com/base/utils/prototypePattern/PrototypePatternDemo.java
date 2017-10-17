package com.base.utils.prototypePattern;

/**
 * <P></P>
 * Created by kevin on 2017/9/4 16:52.
 */
public class PrototypePatternDemo {
    public static void main(String []args){
        ShapeCache.loadCache();

        Shape cloneShape = ShapeCache.getShape("1");//通过克隆获取对象，避免new操作
        System.out.println("Shape:" + cloneShape.getType());

        Shape cloneShape1 = ShapeCache.getShape("1");//通过克隆获取对象，避免new操作
        System.out.println("Shape:" + cloneShape.getType());

        Shape cloneShape2 = ShapeCache.getShape("2");
        System.out.println("Shape:"+ cloneShape2.getType());

        Shape cloneShape3 = ShapeCache.getShape("3");
        System.out.println("shape:"+cloneShape3.getType());
    }
}
