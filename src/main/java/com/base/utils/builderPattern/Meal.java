package com.base.utils.builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * <P></P>
 * Created by kevin on 2017/8/28 11:05.
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }
    public double getCost(){
        double cost = 0.00;
        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }
    public void showItems(){
        for(Item item:items){
            System.out.println(item.name());
            System.out.println(item.packing().pack());
            System.out.println(item.price());
        }
    }
}
