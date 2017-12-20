package com.base.utils;

import java.util.UUID;

public class UUIDUtil {
    public String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
    public static void main(String[] args) {
        UUIDUtil u = new UUIDUtil();
        System.out.println(u.getUUID());
    }
}
