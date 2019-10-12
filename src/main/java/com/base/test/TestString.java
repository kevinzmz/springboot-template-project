package com.base.test;

import java.util.regex.Pattern;

/**
 * @author kevin
 * @version V1.0
 * @Description: TODO
 * @date 2019/9/10 16:20
 **/
public class TestString {
    public static void main(String[] args) {
        String pattern = "[a-zA-Z0-9]+";

        String chinese = "中国";
        String stringDesc = "ERljsf0131";
        String stringDescSec = "ERljsf-0131";

        System.out.println(Pattern.matches(pattern,chinese));
        System.out.println(Pattern.matches(pattern,stringDesc));
        System.out.println(Pattern.matches(pattern,stringDescSec));
    }
}
