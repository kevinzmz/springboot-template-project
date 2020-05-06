package com.base.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * vm args:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @auther kevin
 * @date 2020/4/8 15:57
 */
public class HeapOOM {
    static class OOMOBject{}

    public static void main(String[] args) {
        List<OOMOBject> list = new ArrayList<>();

        while(true){
            list.add(new OOMOBject());
        }
    }
}
