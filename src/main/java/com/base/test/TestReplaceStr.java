package com.base.test;

import com.base.utils.DateUtils;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Date;

/**
 * 测试替换字符串对应位置字符
 *
 * @author
 * @create 2017-11-20 10:39
 **/
public class TestReplaceStr {
    private Integer timeBlock = 10;

    /**
     * 合并资源串和缓存资源串
     * 将缓存中是3，资源串中是0的位置替换为缓存的3
     * 两个长度必须相等
     * @param resStr
     * @param cacheResStr
     * @return
     */
    public String mergeResAndCacheRes(String resStr,String cacheResStr){
        String[] resStrArray = resStr.split("");
        String[] cacheResStrArray = cacheResStr.split("");

        int lengthStr = resStrArray.length;
        StringBuilder tempStr = new StringBuilder("");

        for(int i=0;i<lengthStr;i++){

            if("0".equals(resStrArray[i])&&"3".equals(cacheResStrArray[i])){
                tempStr = tempStr.append(cacheResStrArray[i]);
            }else{
                tempStr = tempStr.append(resStrArray[i]);
            }
        }

        String resultStr = tempStr.toString();

        return resultStr;
    }

    /**
     * <p>
     * 通过异常数据开始时间，结束时间、订单开始时间、订单结束时间。获取订单对应的资源串
     * </p>
     *
     * @param startTime      异常数据开始时间
     * @param endTime        异常数据结束时间
     * @param orderBeginTime 订单开始时间
     * @param orderEndTime   订单结束时间
     * @return
     */
    public String mergeOrderData(Date startTime, Date endTime, Date orderBeginTime, Date orderEndTime, String scheduleStr) {
        //开始时间->结束时间，通过时间块切分后长度（目前时间块为10分钟）
        int scheduleTimeBlockLength = Math.toIntExact(((endTime.getTime() - startTime.getTime()) / (1000 * 60 * timeBlock)));

        //订单开始时间->开始时间，通过时间块切分后长度
        int scheduleOrderBeginBlockLength = Math.toIntExact(((orderBeginTime.getTime() - startTime.getTime()) / (1000 * 60 * timeBlock)));

        //订单开始时间->订单结束时间，通过时间块切分后长度
        int orderTimeBlockLength = Math.toIntExact(((orderEndTime.getTime() - orderBeginTime.getTime()) / (1000 * 60 * timeBlock)));

        //开始时间->订单结束时间
        int scheduleOrderEndBlockLength = scheduleOrderBeginBlockLength + orderTimeBlockLength;

        //将订单用时长度转换成字符串  全部由1组成
        String orderResource = RandomStringUtils.random(orderTimeBlockLength, "1");

        String firstStr = scheduleStr.substring(0, scheduleOrderBeginBlockLength);
        String secondStr = orderResource;
        String thirdStr = scheduleStr.substring(scheduleOrderEndBlockLength, scheduleTimeBlockLength);

        //将订单对应的资源串的位置由orderResource替换
        String agendaScheduleRep = firstStr + secondStr + thirdStr;

        return agendaScheduleRep;
    }

    public static void main(String[] args) {
        String a = "10013330000222211111";
        String b = "00003300303000000300";
        TestReplaceStr testReplaceStr = new TestReplaceStr();
        System.out.println(testReplaceStr.mergeResAndCacheRes(a,b));

        StringBuilder c = new StringBuilder("");
        String d = "abcdefghijklmn";
        String[] e = d.split("");
        for(int i=0;i<e.length;i++){
            c.append(e[i]);
        }
        System.out.println(c);
        c.delete(0,e.length);
        System.out.println("删除后："+c.toString()+";");
        for(int i=0;i<e.length;i++){
            c.append(e[i]);
        }
        System.out.println(c);

        System.out.println(DateUtils.y_M_d_H_m_s.getDateFromStr("2017-11-21 00:50:00").getTime());
        System.out.println(DateUtils.y_M_d_H_m_s.getDateFromStr("2017-11-21 03:00:00").getTime());

        System.out.println("000111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111000000000000".length());
        System.out.println(new Date("1510998000000"));
    }
}
