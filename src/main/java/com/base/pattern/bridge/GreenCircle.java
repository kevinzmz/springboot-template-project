package com.base.pattern.bridge;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-16 10:28
 **/
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color:green,radius: "+radius+", x:"+x+", y:" + y);
    }
}
