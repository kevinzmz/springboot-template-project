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
    private Image param;

    public DynamicProxy(Image param){
        this.param= param;
    }

    public Image getInstance(){
        Image image = (Image) Proxy.newProxyInstance(param.getClass().getClassLoader(), param.getClass().getInterfaces(),new InvoHandler(param));
       //Image image = (Image) Proxy.newProxyInstance(null, realImage.getClass().getInterfaces(),new InvoHandler(realImage));

        return image;
    }
}
