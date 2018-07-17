package com.base.example.javatime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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
    }

    public static void main(String[] args) {
        TestJavaTime testJavaTime = new TestJavaTime();
        testJavaTime.testJavaTime();
    }
}
