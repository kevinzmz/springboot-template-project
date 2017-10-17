package com.base.utils.bridgePattern;

/**
 * <P></P>
 * Created by kevin on 2017/9/11 16:59.
 */
public class BridgePatternDemp {
    public static void main(String []args){
        Shape redCircle = new Circle(100,100,10,new RedCircle());
        Shape greenCircle = new Circle(100,100,10,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
