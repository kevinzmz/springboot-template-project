package com.base.algorithm.mergesort;

import com.alibaba.fastjson.JSON;

/**
 * MergeSortSec
 *
 * @author kevin
 * @version 1.0
 * @date 2021/4/7 13:50
 */
public class MergeSortSec {

    /**
     * merge
     */
    public static void merge(int[] arr, int begin, int middle, int end){
        int leftLen = middle - begin + 1;
        int rightlen = end - middle;

        /**
         * 将区间通过中间值分成两段，进行merge操作
         */
        int[] leftarr = new int[leftLen];
        int[] rightarr = new int[rightlen];
        for(int i=0;i<leftLen;i++){
            leftarr[i] = arr[begin + i];
        }
        for(int i=0;i<rightlen;i++){
            rightarr[i] = arr[middle + i + 1];
        }

        int i = begin;
        int il = 0;
        int ir = 0;
        while(i <= end){
            if(leftarr[il] <= rightarr[ir]){
                arr[i] = leftarr[il];
                il++;
                i++;
            }else{
                arr[i] = rightarr[ir];
                ir++;
                i++;
            }

            if(il == leftLen && (ir) < rightlen){
                for(int j = ir; j < rightlen; j++ ){
                    arr[i] = rightarr[j];
                    i++;
                }
                break;
            }
            if(ir == rightlen && (il) < leftLen){
                for(int j = il; j < leftLen; j++){
                    arr[i] = leftarr[j];
                    i++;
                }
                break;
            }
        }
    }

    public static void mergeSort(int[] arr, int left, int right){
        if(arr == null || arr.length < 2){
            return ;
        }
        int middle = (left + right)/2;
        if(left < right){
            if(middle != left){
                mergeSort(arr, left, middle);
                mergeSort(arr, middle + 1, right);
            }
            merge(arr, left, middle, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,51,8,0,9,2,5,8,4,3,99,23,14,8};
        mergeSort(arr,0 , arr.length-1);
        System.out.println(JSON.toJSONString(arr));
    }
}
