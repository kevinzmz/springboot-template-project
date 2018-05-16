package com.base.jvm;

import java.lang.reflect.Method;

/**
 * <p>JavaClass执行工具</p>
 *
 * @author kevin
 * @create 2018-05-10 17:45
 **/
public class JavaClassExecuter {
    public static String execute(byte[] classByte){
        HackSystem.clearBuffer();
        ClassModifier cm = new ClassModifier(classByte);

        byte[] modiBytes = cm.modifyUTF8Constant("java/lang/System","org/fenixsoft/classloading/execute/HackSystem");
        HotSwapClassLoader loader = new HotSwapClassLoader();
        Class clazz = loader.loadByte(modiBytes);
        try{
            Method method = clazz.getMethod("main",new Class[]{String[].class});
            method.invoke(null,new String[]{null});
        }catch (Throwable e){
            e.printStackTrace(HackSystem.out);
        }

        return HackSystem.getBufferString();
    }
}
