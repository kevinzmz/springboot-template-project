package com.base.test;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * @Author: wangjun
 * @Date: 2019/9/3 19:13
 * @Description:
 */
public class Test2 {
    private final static Integer HTTP_TIME_OUT = 60000;

    private static String appId = "1312423544534563632341";
    private static String productCode = "ecejk0011121528";
    private static String version = "1.0";
    private static String timestamp = "201912031159777";
    private static String appSecret = "94bf38fc7cf9466e8d223d4ff9c70256";
    private static String realName = "李天一";
    private static String idNo = "140426199305180418";
    private static String mobile = "15399898956";

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("appId",appId);
        map.put("productCode",productCode);
        map.put("appSecret",appSecret);
        map.put("version",version);
        map.put("timestamp",timestamp);
//        map.put("signature",signature());
//        map.put("realName",realName);
//        map.put("idNo",idNo);
//        map.put("mobile",mobile);
//        String execute = execute(map, "https://siopenapi.ecej.com/restapi/credit/score");
//        System.out.println(execute);


        map.put("signature",signature1());
        map.put("companyName","测试公司");
        map.put("orderNumber","122");
        map.put("fiveStarNumber","1");
        map.put("fourStarNumber","2");
        map.put("oneStarNumber","3");
        map.put("twoStarNumber","2");
        map.put("threeStarNumber","0");
        map.put("userId","22");
//        map.put("skillTags[0].id","1");
//        map.put("skillTags[0].name","jack");
//        map.put("skillCerts[0].id","1");
//        map.put("skillCerts[0].imagePath","1.jpg");
        String execute = execute(map, "https://siopenapi.ecej.com/restapi/eid/skillscore");
        System.out.println(execute);
    }



    public static String execute(Map<String, String> paramsMap, String url) {
        try {

            MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
            params.setAll(paramsMap);
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.setRequestFactory(getHttpRequestFactory());
            ResponseEntity<String> response = restTemplate.postForEntity(url, params, String.class);
            String result = response.getBody();
            return result;
        } catch (Exception e) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code", "9999");
            jsonObject.put("msg", e.getMessage());
            return jsonObject.toJSONString();
        }
    }

    static SimpleClientHttpRequestFactory getHttpRequestFactory() {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(HTTP_TIME_OUT);
        requestFactory.setReadTimeout(HTTP_TIME_OUT);
        return requestFactory;
    }


   static String signature(){
       Map<String, String> map = new TreeMap<String, String>(new Comparator<String>()
       {
           @Override
           public int compare(String obj1, String obj2)
           {
               return obj1.compareTo(obj2);
           }
       });
       map.put("realName",realName);
       map.put("idNo", idNo);
       map.put("mobile", mobile);
       StringBuilder stringBuilder = new StringBuilder("");
       Set<String> keySet = map.keySet();
       Iterator<String> iter = keySet.iterator();
       while(iter.hasNext())
       {
           String key = iter.next();
           stringBuilder.append("&").append(key).append("=").append(map.get(key));
       }
        String sourceStr = "appId=" + appId + "&productCode=" + productCode + stringBuilder.toString() + "&version=1.0&timestamp=" + timestamp + "&appSecret=" + appSecret;
       String md5Str = getMD5Str(sourceStr,"UTF-8");
       return md5Str;
    }

    static String signature1(){
        Map<String, String> map = new TreeMap<String, String>(new Comparator<String>()
        {
            @Override
            public int compare(String obj1, String obj2)
            {
                return obj1.compareTo(obj2);
            }
        });
        map.put("companyName","测试公司");
        map.put("orderNumber","122");
        map.put("fiveStarNumber","1");
        map.put("fourStarNumber","2");
        map.put("oneStarNumber","3");
        map.put("twoStarNumber","2");
        map.put("threeStarNumber","0");
        map.put("userId","22");
//        map.put("skillTags[0].id","1");
//        map.put("skillTags[0].name","jack");
//        map.put("skillCerts[0].id","1");
//        map.put("skillCerts[0].imagePath","1.jpg");
        StringBuilder stringBuilder = new StringBuilder("");
        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        while(iter.hasNext())
        {
            String key = iter.next();
            stringBuilder.append("&").append(key).append("=").append(map.get(key));
        }
        String sourceStr = "appId=" + appId + "&productCode=" + productCode + stringBuilder.toString() + "&version=1.0&timestamp=" + timestamp + "&appSecret=" + appSecret;
        System.out.println(sourceStr);
        String md5Str = getMD5Str(sourceStr,"UTF-8");
        return md5Str;
    }



    /**
     * md5加密方法
     *
     * @param sourceStr
     * @param charSet
     * @return
     */
    public static String getMD5Str(String sourceStr, String charSet)
    {
        String result = "";
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            try
            {
                md.update(sourceStr.getBytes(charSet));
            }
            catch(UnsupportedEncodingException e)
            {
                md.update(sourceStr.getBytes());
            }
            byte b[] = md.digest();

            int i;
            StringBuffer buf = new StringBuffer("");
            for(int offset = 0; offset < b.length; offset++)
            {
                i = b[offset];
                if(i < 0)
                    i += 256;
                if(i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            result = buf.toString();
        }
        catch(NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return result;
    }

}
