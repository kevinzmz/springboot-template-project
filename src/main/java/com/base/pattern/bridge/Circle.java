package com.base.pattern.bridge;

/**
 * <p>Shape实现类</p>
 *
 * @author kevin
 * @create 2018-05-16 10:42
 **/
public class Circle extends Shape{
    private int x,y,radius;

    public Circle(int x,int y,int radius,DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
