package com.base.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.base.model.*;
import org.python.google.common.collect.HashBasedTable;
import org.python.google.common.collect.Table;
import org.springframework.cglib.beans.BeanCopier;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.commons.beanutils.BeanUtils;

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

    public static <T,M> M cloneObj(T objFrom,Class<M> clazz){
        String fromStr = JSON.toJSONString(objFrom);
        M toStr = JSON.parseObject(fromStr,clazz);
        return toStr;
    }

    public static <T,M> M cloneObjSec(T objFrom,M objTo){
        String fromStr = JSON.toJSONString(objFrom);
        return null;
    }

    private static final Table<Class, Class, BeanCopier> BEAN_COPIER_TABLE = HashBasedTable.create();

    public static <T, R> R copy(T t, Class<R> klass) {
        BeanCopier beanCopier = BEAN_COPIER_TABLE.get(t.getClass(), klass);
        if (beanCopier == null) {
            beanCopier = BeanCopier.create(t.getClass(), klass, false);
            BEAN_COPIER_TABLE.put(t.getClass(), klass, beanCopier);
        }
        try {
            R r = klass.newInstance();
            beanCopier.copy(t, r, null);
            return r;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static <T,M> List<M> cloneObj(List<T> objFrom,Class<M> mType){
        objFrom = Optional.ofNullable(objFrom).orElse(new ArrayList<>());
        List<M> mList = new ArrayList<>();
        for(T item : objFrom){
            M m = JSON.parseObject(JSON.toJSONString(item),mType);
            mList.add(m);
        }
        return mList;
    }

    public static <T,M> TestObjThree<M> copyPageInfo(TestObjThree<T> from,Class<M> clazzm) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        TestObjThree<M> pageInfo = (TestObjThree<M>)BeanUtils.cloneBean(from);
        pageInfo.setUserList(cloneObj(from.getUserList(),clazzm));
        return pageInfo;
    }

    public static Object copy(Object t,Object m){
        String out = JSON.toJSONString(t);
        m  = JSON.parseObject(out,Object.class);
        return m;
    }

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        User user = new User();
        user.setId(1);
        user.setName("1");
        user.setEmail("email");

        List<User> userList = new ArrayList<>();
        userList.add(user);

/*        TestObj obj = new TestObj();;
        obj.setId("1");
        obj.setBusinessType(1);
        obj.setUserList(userList);*/

 /*       System.out.println("克隆前：" + JSON.toJSONString(obj));
        TestObj cloneObj = cloneObj(obj);
        System.out.println("克隆后：" + JSON.toJSONString(cloneObj));

        System.out.println("克隆前：" + JSON.toJSONString(obj));
        TestObjSec cloneSec = TestClone.cloneObj(cloneObj,TestObjSec.class);
        System.out.println("克隆后：" + JSON.toJSONString(cloneSec));*/

        TestObjThree<User> obj3 = new TestObjThree<>();
        obj3.setId("2");
        obj3.setBusinessType(2);
        obj3.setUserList(userList);

/*        TestObjThree<UserSec> obj4 = new TestObjThree();
        System.out.println("克隆前：" + JSON.toJSONString(obj3));
        obj4 = TestClone.cloneObjSec(obj3,obj4);
        System.out.println("克隆后：" + JSON.toJSONString(obj4));*/

        TestObjThree<UserSec> obj5 = new TestObjThree();
        System.out.println("克隆前：" + JSON.toJSONString(obj3));
        Object c = TestClone.copyPageInfo(obj3,UserSec.class);
        System.out.println("克隆后：" + JSON.toJSONString(c));
    }
}
