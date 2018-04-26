package com.base.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>餐饮</p>
 *
 * @author kevin
 * @create 2018-04-26 10:23
 **/
public class Meal {
    private List<Item> list = new ArrayList<Item>();

    public void addItem(Item item){
        list.add(item);
    }

    public float getCost(){
        float cost =0.0f;
        for(Item item:list){
            cost +=item.price();
        }
        return cost;
    }

    public void showItem(){
        list.stream().filter(a->a!=null).forEach(b->{
            System.out.println("Item:"+b.name());
            System.out.println("Packing:"+b.packing().pack());
            System.out.println("price:"+b.price());
        });
    }
}
