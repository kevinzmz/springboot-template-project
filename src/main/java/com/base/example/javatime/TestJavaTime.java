package com.base.example.javatime;

import org.apache.commons.lang3.time.DateUtils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;

/**
 * <p>java.time包实现</p>
 *
 * @author kevin
 * @create 2018-07-13 14:12
 **/
public class TestJavaTime {

    public void testJavaTime() {
        LocalDateTime localDateTime = LocalDateTime.of(1987,6,26,17,32,0);
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.LONG).format(localDateTime).toString());
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.MEDIUM).format(localDateTime).toString());
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT).format(localDateTime).toString());
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDateTime).toString());

        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());

        final LocalDateTime from = LocalDateTime.of( 2015, Month.APRIL, 16, 0, 0, 0 );
        final LocalDateTime to = LocalDateTime.of( 2015, Month.APRIL, 17, 0, 0, 0 );

        final Duration duration = Duration.between( from, to );
        System.out.println( "Duration in days: " + duration.toDays() );
        System.out.println( "Duration in hours: " + duration.toHours() );

        Date date = new Date();
        int minutes = 5;
        System.out.println(DateUtils.addMinutes(date,-minutes));

        System.out.println(ZoneId.systemDefault().getDisplayName(TextStyle.FULL, Locale.CHINA));
    }

    public static void main(String[] args) {
        TestJavaTime testJavaTime = new TestJavaTime();
        testJavaTime.testJavaTime();
    }
}
