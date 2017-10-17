package com.base.utils.bridgePattern;

/**
 * <P></P>
 * Created by kevin on 2017/9/11 16:51.
 */
public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color:red,radius:"+radius+",x:"+x+",y:"+y+"]");
    }
}
