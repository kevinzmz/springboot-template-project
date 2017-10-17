package com.base.utils.commandPattern;

/**
 * <P></P>
 * Created by kevin on 2017/9/20 10:10.
 */
public class Stock {
    private String name = "ABC";
    private int quantity=10;

    public void buy(){
        System.out.println("Stock [ Name: " +name+",Quantity: "+quantity+" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+",Quantity: "+quantity+"] sold");
    }

}
