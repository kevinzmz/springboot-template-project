package com.base.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @auther kevin
 * @date 2020/7/14 11:47
 */
public class TestTime {
    public static void main(String[] args) {
        String workDateStr = "2020-07-14";
        String add = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDate.parse(workDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd")).plus(1L, ChronoUnit.DAYS));
        System.out.println(add);
    }
}
