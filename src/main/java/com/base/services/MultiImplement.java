package com.base.services;

/**
 * @auther kevin
 * @date 2020/3/18 10:55
 */
public class MultiImplement implements OneInterface,TwoInterface{
    @Override
    public void getOne() {
        System.out.println("interface one");
    }

    @Override
    public void getTwo() {
        System.out.println("interface two");
    }

    public static void main(String[] args) {
        OneInterface one = new MultiImplement();
        one.getOne();

        MultiImplement mul = new MultiImplement();
        mul.getOne();
        mul.getTwo();
    }
}
