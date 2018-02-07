package com.base.test;

/**
 * <P></P>
 * Created by kevin on 2017/8/15 13:57.
 */
public enum TestEnum {
    INSTANCE(1,"a","aa"),A(2,"b","bb"),B(3,"c","cc"),c(4,"d","dd");
    private int count;
    private String cha;
    private String thi;
    TestEnum(int count,String cha,String thi){
        this.count = count;
        this.cha = cha;
        this.thi = thi;
    }
    public int getValue(){
        return count;
    }
    public String getCha(){
        return cha;
    }
    public String getThi(){
        return thi;
    }
    public void getInstance(){
        System.out.println(getValue());
        System.out.println(getCha());
        System.out.println(getThi());
    }

    public static void main(String []args){
        TestEnum.A.getInstance();
    }
}
