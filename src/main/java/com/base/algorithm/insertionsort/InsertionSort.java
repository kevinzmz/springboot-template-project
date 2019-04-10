package com.base.algorithm.insertionsort;

import com.alibaba.fastjson.JSON;

/**
 * <p>插入排序</p>
 *
 * @author kevin
 * @create 2018-05-04 11:57
 **/
public class InsertionSort {
    /**
     * 插入排序
     *
     * @return
     */
    public static Integer[] getInsertionSort(Integer[] input) {
        for (int i = 0; i < input.length; i++) {
            Integer current = input[i];
            //保存当前值位置
            int location = i;
            //返回比当前值小的位置
            do {
                location = location - 1;
                //确定是按照升序还是降序排列
            } while (location >= 0 && current > input[location]);
            //+1作为当前值的位置
            location++;

            //将当前值应该待的位置之后的数据后移一格
            for (int j = i - 1; j >= location; j--) {
                input[j + 1] = input[j];
            }

            //将当前值放置到预期位置
            input[location] = current;
        }

        return input;
    }

    /**
     * 插入排序，优化代码
     * for i=1 to A.length-1
     *      key = A[i]
     *      j = i-1
     *
     *      while j > 0 && A[j] < key
     *          A[j+1] = A[j]
     *          j--
     *
     *      input[j+1] = key
     *
     * @param input
     * @return
     */
    public static Integer[] getInsertSortSec(Integer[] input) {
        for (int i = 1; i < input.length; i++) {
            Integer operData = input[i];

            int j = i - 1;

            //j>=0用来确保循环终止
            while (j >= 0 && input[j] < operData) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = operData;
        }
        return input;
    }

    public static void main(String[] args) {
        Integer[] input = {1, 5, 28, 36, 16, 6, 18, 5, 21, 25, 4, 3, 8, 3};

        Integer[] output = InsertionSort.getInsertionSort(input);

        System.out.println(JSON.toJSONString(output));

        Integer[] outputSec = InsertionSort.getInsertSortSec(input);

        System.out.println(JSON.toJSONString(outputSec));
    }
}
