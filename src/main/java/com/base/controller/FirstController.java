package com.base.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
    public String getFirstPage(Model model,HttpServletRequest req, HttpServletResponse res, HttpSession session){
        Object[] obj =new Object[]{req};
        //String params = JSONObject.toJSONStringWithDateFormat(obj, "yyyy-MM-dd HH:mm:ss", new SerializerFeature[]{SerializerFeature.WriteMapNullValue});
        //String params = JSONObject.toJSONString(session);
        return "firstPage";
    }
}
