package com.base.pattern.bridge;

/**
 * <p>桥接实现类</p>
 *
 * @author kevin
 * @create 2018-05-16 10:22
 **/
public class RedCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle color:red,radius:"+ radius+", x:" +x+", y:"+y);
    }
}
