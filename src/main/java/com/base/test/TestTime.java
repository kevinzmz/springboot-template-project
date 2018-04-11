package com.base.test;

import org.apache.commons.lang3.time.DateUtils;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

/**
 * 测试java8 新版日期时间处理api
 */
public class TestTime {
    public static void getLocalTime(){
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());

        final LocalDateTime from = LocalDateTime.of( 2015, Month.APRIL, 16, 0, 0, 0 );
        final LocalDateTime to = LocalDateTime.of( 2015, Month.APRIL, 17, 0, 0, 0 );

        final Duration duration = Duration.between( from, to );
        System.out.println( "Duration in days: " + duration.toDays() );
        System.out.println( "Duration in hours: " + duration.toHours() );
    }
    public static void main(String[] args) {
        getLocalTime();
        Date date = new Date();
        int minutes = 5;
        System.out.println(DateUtils.addMinutes(date,-minutes));
    }
}
