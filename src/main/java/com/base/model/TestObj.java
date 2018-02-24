package com.base.model;

import com.alibaba.fastjson.JSON;

/**
 * <p>
 * Mongo data Bean
 * </p>
 *
 * @author
 * @create 2018-01-02 14:43
 * @Modified By:
 **/
public class TestObj {
    private String id;
    private Integer businessType;
    private String checkBalanceFkag;
    private String testId;

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

    @Override
    public String toString() {
        return super.toString();
    }
}
