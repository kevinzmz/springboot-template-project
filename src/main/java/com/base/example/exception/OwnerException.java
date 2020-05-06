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

    public Integer testFinal(){
        Integer result = 2;
        try{
            System.out.println("test final!");
        }finally {
            result = 1;
            if(result == 1){
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) throws OwnerException {
        System.out.println(new OwnerException("exception").testFinal());

        //throw new OwnerException("异常");
    }
}
