package com.base.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <P></P>
 * Created by kevin on 2017/9/18 10:57.
 */
@Aspect
@Component
public class LogAspects {
    @Pointcut("execution(public * com.base.*.*(..))")
    public void pointcutExecu(){}

    @After("pointcutExecu()")
    public void doAfter(){
        System.out.println("拦截方法输出");
    }
}
