package com.base.example.javatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @auther kevin
 * @date 2020/1/14 15:47
 */
public class TestLocalDate {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
    }
}
