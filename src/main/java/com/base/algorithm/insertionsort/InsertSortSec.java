package com.base.algorithm.insertionsort;

import com.alibaba.fastjson.JSON;

/**
 * InsertSortSec
 *
 * @author kevin
 * @version 1.0
 * @date 2021/4/7 10:27
 */
public class InsertSortSec {
    public static void insertSort(int[] arr){
        if(arr ==  null || arr.length == 0){
            return;
        }
        for(int i=1;i<arr.length;i++){
            int j = i-1;
            int oper = arr[i];
            while(j>=0 && arr[j] < oper){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = oper;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,1,3,6,6,7,2,9,0,3,4};
        insertSort(arr);
        System.out.println(JSON.toJSONString(arr));
    }
}
