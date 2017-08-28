package com.base.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <P></P>
 * Created by kevin on 2017/8/28 16:05.
 */
public class DateTimeUtiles {
    /**
     * 获取yyyy-MM-dd格式数据
     * @return
     */
    public static String getDate(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String result = simpleDateFormat.format(date);
        return result;
    }
    public static void main(String []args){
        Date date = new Date();
        System.out.println(DateTimeUtiles.getDate(date));
    }
}
