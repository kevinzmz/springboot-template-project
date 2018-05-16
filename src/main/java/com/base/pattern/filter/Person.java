package com.base.pattern.filter;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-05-16 11:08
 **/
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public String getMaritalStatus(){
        return maritalStatus;
    }
}
