package com.base.pattern.Proxy;

/**
 * <p>被代理类实现类</p>
 *
 * @author kevin
 * @create 2018-04-08 15:59
 **/
public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;

    }

    public RealImage() {

    }

    @Override
    public void display() {
        System.out.println("Displaying" + fileName);
    }

    private void loadFromDist(String filename){
        System.out.println("loading" + fileName);
    }
}
