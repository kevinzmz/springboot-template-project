package com.base.utils.bridgePattern;

/**
 * <P></P>
 * Created by kevin on 2017/9/11 16:54.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
