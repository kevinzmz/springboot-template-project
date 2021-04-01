package com.base.model;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * Mongo data Bean
 * </p>
 *
 * @author
 * @create 2018-01-02 14:43
 * @Modified By:
 **/
public class TestObj implements Serializable {
    private static final Long serialVersionUID = 1L;

    private String id;
    private Date date;
    private int testInt;
    private Integer businessType;
    private String checkBalanceFkag;
    private String testId;
    private List<User> userList;

    public TestObj(){
        
    }

    public TestObj(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTestInt() {
        return testInt;
    }

    public void setTestInt(int testInt) {
        this.testInt = testInt;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public String getCheckBalanceFkag() {
        return checkBalanceFkag;
    }

    public void setCheckBalanceFkag(String checkBalanceFkag) {
        this.checkBalanceFkag = checkBalanceFkag;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
