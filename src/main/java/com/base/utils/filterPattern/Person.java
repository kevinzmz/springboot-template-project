package com.base.utils.filterPattern;

/**
 * <P></P>
 * Created by kevin on 2017/9/12 16:08.
 */
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
