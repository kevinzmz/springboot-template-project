package com.base.utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * <p>
 * 时间工具类
 * 通过枚举实现
 * </p>
 * <p>
 * 命名规范:年月日设置时"-"用下划线"_"表示
 * 小时分钟秒毫秒设置时":"用下划线"_"表示
 * 年月日设置时"_"用双下划线"__"表示
 * 小时分钟秒毫秒设置时"_"用双下划线"__"表示
 * 中间空格用"_"表示
 * 时间正斜线"/"用"l"表示
 * 时间反斜线"\"用"L"表示
 * </P>
 * Created by kevin on 2017/8/28 16:11.
 */
public enum DateUtils {
    y__M__d("yyyy_MM_dd"),
    y_M_d("yyyy-MM-dd"),
    M_d("MM-dd"),
    y("yyyy"),
    y_M_d_H_m_s_S("yyyy-MM-dd HH:mm:ss SSS"),
    y_M_d_H_m("yyyy-MM-dd HH:mm"),
    H_m("HH:mm"),
    y_M_d_H_m_s("yyyy-MM-dd HH:mm:ss"),
    yMd("yyyyMMdd"),
    yMd_H_m("yyyyMMdd HH:mm"),
    ylMld_H_m("yyyy/MM/dd HH:mm");

    private String datePattern;

    DateUtils(String datePattern) {
        this.datePattern = datePattern;
    }

    private String getPattern() {
        return this.datePattern;
    }

    /**
     * 根据日期类型获取字符串类型
     *
     * @param date
     * @return
     */
    public String getFormatDate(Date date) {
        String datePattern = this.getPattern();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        String result = simpleDateFormat.format(date);
        return result;
    }

    /**
     * 根据字符串类型获取日期类型
     *
     * @param date
     * @return
     */
    public Date getDateFromStr(String date) {
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

    /**
     * 根据日期获取是周几
     *
     * @param date
     * @return
     */
    public String getDayForWeek(String date) {
        String datePattern = this.getPattern();
        SimpleDateFormat format = new SimpleDateFormat(datePattern);
        Date tmpDate = null;
        try {
            tmpDate = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(getDateFromStr(date));

        int weekNum = calendar.get(Calendar.DAY_OF_WEEK);
        String weekStr = null;
        switch (weekNum) {
            case 1:
                weekStr = "周日";
                break;
            case 2:
                weekStr = "周一";
                break;
            case 3:
                weekStr = "周二";
                break;
            case 4:
                weekStr = "周三";
                break;
            case 5:
                weekStr = "周四";
                break;
            case 6:
                weekStr = "周五";
                break;
            case 7:
                weekStr = "周六";
                break;
        }

        /**
         * 判断日期是不是当天日期
         */
        if (date.equals(getFormatDate(new Date()))) {
            weekStr = "今天";
        }

        /**
         * 判断日期是不是明天
         */
        calendar.add(Calendar.DATE, -1);
        if (getFormatDate(calendar.getTime()).equals(getFormatDate(new Date()))) {
            weekStr = "明天";
        }

        return weekStr;
    }

    /**
     * 根据传入日期和调整幅度获取加几天或减几天后的日期
     * 正数加，负数减
     * @param date
     * @param count
     * @return
     */
    public String getAddOrRedDate(String date,int count){
        String datePattern = this.getPattern();
        SimpleDateFormat format = new SimpleDateFormat(datePattern);
        Date tmpDate = null;
        try {
            tmpDate = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(getDateFromStr(date));
        calendar.add(Calendar.DATE,count);
        String dateResult = getFormatDate(calendar.getTime());

        return dateResult;
    }

    /**
     * 根据日期返回当前日期零点时间
     * @param date
     * @return
     */
    public Date getZeroDate(Date date){
        String zeroStr = DateUtils.y_M_d.getFormatDate(date);
        zeroStr = zeroStr+" 00:00:00";
        Date zeroDate = DateUtils.y_M_d_H_m_s.getDateFromStr(zeroStr);
        return zeroDate;
    }


    public static void main(String[] args) {
        Date date = new Date();
       /* System.out.println(DateUtils.y_M_d.getFormatDate(date));
        System.out.println(DateUtils.ylMld_H_m.getFormatDate(date));
        System.out.println(DateUtils.y__M__d.getFormatDate(date));
        System.out.println(DateUtils.y_M_d_H_m_s_S.getDateFromStr(DateUtils.y_M_d_H_m_s_S.getFormatDate(date)));
        System.out.println(DateUtils.y_M_d_H_m_s.getDateFromStr("2017-11-05 07:30:00"));*/
        System.out.println(DateUtils.y_M_d.getAddOrRedDate("2017-11-09",0));
    }
}
