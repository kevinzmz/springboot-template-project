package com.base.model;

import java.io.Serializable;
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
public class TestObjThree<T> implements Serializable {
    private static final Long serialVersionUID = 1L;

    private String id;
    private Integer businessType;
    private String checkBalanceFkag;
    private String testId;
    private List<T> userList;

    public TestObjThree(){

    }

    public TestObjThree(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<T> getUserList() {
        return userList;
    }

    public void setUserList(List<T> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
