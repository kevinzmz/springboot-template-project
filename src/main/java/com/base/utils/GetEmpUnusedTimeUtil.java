package com.base.utils;

import com.base.model.TimeInfoBean;

import java.util.ArrayList;
import java.util.List;

/**
 * <P></P>
 * Created by kevin on 2017/8/16 17:34.
 */
public class GetEmpUnusedTimeUtil {
    public List<TimeInfoBean> testUtils(int len, String a, List<TimeInfoBean> list) {
        byte[] str = a.getBytes();
        //获取第一个0位置
        int firstIndex = a.indexOf("0");
        int length = 0;
        TimeInfoBean timeInfoBean = new TimeInfoBean();
        int cycleIndex = firstIndex;
        while (cycleIndex>=0 && str.length > cycleIndex) {
            if (str[cycleIndex] == '0') {  //可以扩展为多条件判断
                cycleIndex++;
                length++;
                if (str.length > cycleIndex) {
                    continue;
                } else {
                    timeInfoBean.setLength(length);
                    timeInfoBean.setLocationIndex(len+firstIndex);
                    list.add(timeInfoBean);
                    return list;
                }
            }else{
                a = a.substring(cycleIndex, a.length());
                timeInfoBean.setLength(length);
                timeInfoBean.setLocationIndex(len+firstIndex);
                list.add(timeInfoBean);
                testUtils(len + firstIndex + length, a, list);//上一循环长度 + 起始长度 + 数据长度
                return list;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String a = "0000111100001100100010000000000101";
        List<TimeInfoBean> list = new ArrayList<TimeInfoBean>();
        GetEmpUnusedTimeUtil gotEmpUnusedTimeUtil = new GetEmpUnusedTimeUtil();
        gotEmpUnusedTimeUtil.testUtils(0,a, list);
        for(TimeInfoBean t:list){
            System.out.println("===========================");
            System.out.println(t.getLength());
            System.out.println(t.getLocationIndex());
        }
    }
}
