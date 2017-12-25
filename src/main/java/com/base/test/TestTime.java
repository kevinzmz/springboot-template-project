package com.base.test;

import com.base.utils.DateUtils;

public class TestTime {
    public static void main(String[] args) {
        System.out.println(DateUtils.y_M_d_H_m_s_S.getDateFromStr("2017-11-05 05:30:00 0").getTime());
    }
}
