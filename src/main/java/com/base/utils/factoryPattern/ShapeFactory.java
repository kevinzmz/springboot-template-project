package com.base.utils.factoryPattern;

/**
 * <P></P>
 * Created by kevin on 2017/9/11 17:26.
 */
public class ShapeFactory {
    public static Object getClass(Class<? extends Shape> clazz){
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
