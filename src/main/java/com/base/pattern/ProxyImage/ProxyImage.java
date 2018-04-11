package com.base.pattern.ProxyImage;

/**
 * <p>代理类</p>
 *
 * @author kevin
 * @create 2018-04-08 16:04
 **/
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage==null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
