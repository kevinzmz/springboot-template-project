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

    @Override
    public String display() {
        System.out.println("Displaying：" + fileName);
        return null;
    }
}
