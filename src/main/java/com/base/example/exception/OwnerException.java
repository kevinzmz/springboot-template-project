package com.base.example.exception;

/**
 * <p>
 *     实现自己的异常类
 * </p>
 *
 * @author kevin
 * @create 2019-01-17 14:09
 **/
public class OwnerException extends Exception{
    public OwnerException(String message){
        super(message);
    }

    public static void main(String[] args) throws OwnerException {
        throw new OwnerException("异常");
    }
}
