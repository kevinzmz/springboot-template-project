package com.base.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <P></P>
 * Created by kevin on 2017/8/8 10:11.
 */
@Controller
public class FirstController extends BaseController{
    private static final Logger logger = LoggerFactory.getLogger(FirstController.class);

    @RequestMapping("first")
    public String getFirst(Model model){
        logger.info("test");
        model.addAttribute("test","testaaaaaaaaaaaa");
       return "first";
    }
    @RequestMapping("firstPage")
    public String getFirstPage(){
        return "firstPage";
    }
}
