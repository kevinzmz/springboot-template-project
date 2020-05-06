package com.base.pattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <p>JDK动态代理</p>
 *
 * @author kevin
 * @create 2018-04-08 16:24
 **/
public class InvoHandler implements InvocationHandler {
    //private static final Logger logger = LoggerFactory.getLogger(InvoHandler.class);

    private Object target;

    InvoHandler(Object target){
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //logger.info("method name：{},params；{}",method.getName(),JSON.toJSONString(args));

        //对方法和参数进行拦截
        Object result = method.invoke(target,args);
        return result;
    }
}
