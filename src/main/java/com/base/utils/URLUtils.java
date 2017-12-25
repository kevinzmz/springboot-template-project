package com.base.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 获取http请求路径
 *
 * @author
 * @create 2017-12-25 14:48
 **/
@Component
public class URLUtils {
    @Value("${ecej.esmart.oss.rest}")
    private String httpUrl;

    private String prefix="/";

    /**
     * 返回用户请求路径
     * @param requestMethod
     * @return
     */
    public String getUrlStr(String requestMethod) throws Exception {
        String returnResult = null;
        if(requestMethod!=null && requestMethod.matches("^\\/.*")){
            if(httpUrl.endsWith("/")){
               returnResult = httpUrl.substring(0,httpUrl.length()-1) + requestMethod;
            }else{
                returnResult = httpUrl + requestMethod;
            }
        }else if(requestMethod!=null){
            if(httpUrl.endsWith("/")){
                returnResult = httpUrl + requestMethod;
            }else{
                returnResult = httpUrl + prefix + requestMethod;
            }
        }else{
            Exception e = new Exception();
            throw e;
        }

        return returnResult;
    }
}
