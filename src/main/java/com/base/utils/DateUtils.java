package com.base.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 *     时间工具类
 *     通过枚举实现单例模式
 * </p>
 * <P>
 *     命名规范:年月日设置时"-"用下划线"_"表示
 *              小时分钟秒毫秒设置时":"用下划线"_"表示
 *              年月日设置时"_"用双下划线"__"表示
 *              小时分钟秒毫秒设置时"_"用双下划线"__"表示
 *              中间空格用"_"表示
 *              时间正斜线"/"用"l"表示
 *              时间反斜线"\"用"L"表示
 * </P>
 * Created by kevin on 2017/8/28 16:11.
 */
public enum DateUtils {
    y__M__d("yyyy_MM_dd"),
    y_M_d("yyyy-MM-dd"),
    y_M_d_H_m_s_S("yyyy-MM-dd HH:mm:ss SSS"),
    yMd("yyyyMMdd"),
    yMd_H_m("yyyyMMdd HH:mm"),
    ylMld_H_m("yyyy/MM/dd HH:mm");

    private String datePattern;

    DateUtils(String datePattern) {
        this.datePattern = datePattern;
    }

    private String getPattern(){
        return this.datePattern;
    }

    public String getFormatDate(Date date){
        String datePattern = this.getPattern();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        String result = simpleDateFormat.format(date);
        return result;
    }

    public Date getDateFromStr(String date){
        String datePattern = this.getPattern();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        Date formateDate = null;
        try {
            formateDate = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formateDate;
    }

    public static void main(String []args){
        Date date = new Date();
        System.out.println(DateUtils.y_M_d.getFormatDate(date));
        System.out.println(DateUtils.ylMld_H_m.getFormatDate(date));
        System.out.println(DateUtils.y__M__d.getFormatDate(date));
        System.out.println(DateUtils.y_M_d_H_m_s_S.getDateFromStr(DateUtils.y_M_d_H_m_s_S.getFormatDate(date)));
    }
}
