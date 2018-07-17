package com.base.algorithm.bubblesort;

import com.alibaba.fastjson.JSON;

/**
 * <p>冒泡排序</p>
 *
 * @author kevin
 * @create 2018-07-17 10:07
 **/
public class BubbleSort {
    /**
     * 通过冒泡排序获取数组
     * for i = 1 to A.length-1
     *      for j = A.length downto i+1
     *          if A[j] < A[j-1]
     *              exchange A[j] with A[j-1]
     * @param input
     * @return
     */
    public static Integer[] getBubbleSort(Integer[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = input.length-1; j > i; j--) {
                if (input[j] < input[j - 1]) {
                    Integer a = input[j-1];
                    input[j-1] = input[j];
                    input[j] = a;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        Integer[] input = {4,1,6,2,7,8,2,9,0,7};

        System.out.println(JSON.toJSONString(getBubbleSort(input)));
    }
}
