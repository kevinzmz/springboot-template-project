package com.base.pattern.Proxy;

import java.lang.reflect.Proxy;

/**
 * @Description: 动态代理层
 *
 * @author kevin
 * @version V1.0
 * @date 2019/9/1 10:44
 **/
public class DynamicProxy {
    private String param;

    public DynamicProxy(String param){
        this.param= param;
    }

    public Image getInstance(){
        Image realImage = new RealImage(param);

        Image image = (Image) Proxy.newProxyInstance(realImage.getClass().getClassLoader(), realImage.getClass().getInterfaces(),new InvoHandler(realImage));

        return image;
    }
}
