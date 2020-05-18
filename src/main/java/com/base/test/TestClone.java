package com.base.test;

import com.alibaba.fastjson.JSON;
import com.base.model.TestObj;
import com.base.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther kevin
 * @date 2020/5/18 17:10
 */
public class TestClone {
    public static <T extends Serializable> T cloneObj(T obj){
        T cloneObj = null;

        ByteArrayOutputStream out = null;
        ObjectOutputStream obs = null;
        ByteArrayInputStream input = null;
        ObjectInputStream inObs = null;

        try{
            out = new ByteArrayOutputStream();
            obs = new ObjectOutputStream(out);
            obs.writeObject(obj);
            obs.close();

            input = new ByteArrayInputStream(out.toByteArray());
            inObs = new ObjectInputStream(input);
            cloneObj = (T) inObs.readObject();

            inObs.close();
        }catch (Exception e){
         e.printStackTrace();
        }finally{
            try{
                if(out != null){
                    out.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            try{
                if(obs != null){
                    obs.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            try{
                if(input != null){
                    input.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            try{
                if(inObs != null){
                    inObs.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        return cloneObj;
    }

    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("1");

        List<User> userList = new ArrayList<>();
        userList.add(user);

        TestObj obj = new TestObj();
        obj.setId("1");
        obj.setBusinessType(1);
        obj.setUserList(userList);

        System.out.println("克隆前：" + JSON.toJSONString(obj));
        TestObj cloneObj = cloneObj(obj);
        System.out.println("克隆后：" + JSON.toJSONString(cloneObj));

    }
}
