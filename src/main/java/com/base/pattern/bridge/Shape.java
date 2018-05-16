package com.base.pattern.bridge;

/**
 * <p>使用DrawAPI接口创建抽象类Shape</p>
 *
 * @author kevin
 * @create 2018-05-16 10:33
 **/
public abstract class Shape{
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
