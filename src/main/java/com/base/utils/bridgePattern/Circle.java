package com.base.utils.bridgePattern;


/**
 * <P></P>
 * Created by kevin on 2017/9/11 16:56.
 */
public class Circle extends Shape{
    private int x,y,radius;

    protected Circle(int x,int y,int radius,DrawAPI drawAPI) {
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
