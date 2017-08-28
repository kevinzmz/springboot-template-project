package com.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <P></P>
 * Created by kevin on 2017/8/8 10:11.
 */
@Controller
public class FirstController extends BaseController{
    @RequestMapping("first")
    public String getFirstPage(){
       return "first";
    }
}
