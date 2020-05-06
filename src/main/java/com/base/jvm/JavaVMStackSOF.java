package com.base.jvm;

/**
 * vm args: -Xss128k
 * @auther kevin
 * @date 2020/4/8 16:26
 */
public class JavaVMStackSOF {
    private int stackLength = 1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args)  throws Throwable{
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try{
            oom.stackLeak();
        }catch (Exception e){
            System.out.printf("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
