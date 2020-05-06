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
        String pattern = "^(?=.*?[0-9])(?=.*?[a-z])(?=.*?[A-Z]).{8,18}$";

        String chinese = "中国";
        String china = "中国";
        String ch = new String("中国");
        String stringDesc = "ERljsfab";
        String stringDescSec = "ERljsf-0131";
        String station = "BCA_'淄博'服务公司_86";

        System.out.println(Pattern.matches(pattern,chinese));
        System.out.println(Pattern.matches(pattern,stringDesc));
        System.out.println(Pattern.matches(pattern,stringDescSec));


        System.out.println(station.indexOf("淄博"));
        System.out.println(station.indexOf("BCA"));
        System.out.println(station.indexOf("服务公司"));

        System.out.println(chinese == china);
        System.out.println(chinese.intern() == china.intern());
        System.out.println(chinese == ch);
        System.out.println(chinese.intern() == ch.intern());
        System.out.println(chinese.equals(ch));
    }
}
