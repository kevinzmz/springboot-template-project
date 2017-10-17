package com.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <P></P>
 * Created by kevin on 2017/8/2 14:29.
 */
@RestController
public class RestCommonController {
    @RequestMapping("test")
    public Map<String,String> getCommonTestResult(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("a","123");
        map.put("b","456");
        return map;
    }
}
