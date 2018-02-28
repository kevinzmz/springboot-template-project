package com.base.test;

import java.util.function.Supplier;

/**
 * <P></P>
 * Created by kevin on 2017/8/16 16:38.
 */
public interface ObjectInterface {
    public void drawPicture();
    static Object create(Supplier<Object> supplier){
        return supplier.get();
    }
}
