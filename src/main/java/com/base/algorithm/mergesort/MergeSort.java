package com.base.algorithm.mergesort;

import com.alibaba.fastjson.JSON;

/**
 * <p>
 *     合并排序
 * </p>
 *
 * @author kevin
 * @create 2018-05-18 15:13
 **/
public class MergeSort {

    /**
     * 将已经排好的子队列进行合并排序
     * @param arraySorting
     * @param begin
     * @param middle
     * @param end
     * @return
     */
    public static int[] merge(int[] arraySorting,int begin,int middle,int end){
        int n1 = middle-begin +1;
        int n2 = end-middle;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i=0;i<n1;i++){
            leftArray[i] = arraySorting[begin+i];
        }

        for(int i=0;i<n2;i++){
            rightArray[i] = arraySorting[middle+i+1];
        }

        int a = 0;
        int b = 0;
        /*
            循环合并两个子队列
         */
        for(int i=begin;i<=end;i++){
            if(leftArray[a]<=rightArray[b]){
                arraySorting[i] = leftArray[a];
                a++;
            }else{
                arraySorting[i] = rightArray[b];
                b++;
            }

            /*
                如果其中一个子队列已经循环结束，另一个子队列直接追加拷贝到主队列
             */
            if(a==n1 && b<n2){
                int k = i+1;
                for(int j=k;k<=end;k++){
                    arraySorting[k] = rightArray[b];
                    b++;
                }
                break;
            }else if(b==n2 && a<n1){
                int k = i+1;
                for(int j = k;k<=end;k++){
                    arraySorting[k] = leftArray[a];
                    a++;
                }
                break;
            }
        }
        return arraySorting;
    }

    /**
     * 递归将队列拆分成子队列并进行排序合并
     * @param arrayFinal
     * @param begin
     * @param end
     */
    public static void mergeSort(int[] arrayFinal,int begin,int end){
        int middle = (begin+end)/2;
        if(begin<end){
            if(middle!=begin){
                mergeSort(arrayFinal,begin,middle);
                mergeSort(arrayFinal,middle+1,end);
            }
            merge(arrayFinal,begin,middle,end);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,3,6,2,5,2,7,8,4,3,5,2,5,9,4,6,7};
        MergeSort.mergeSort(a,0,a.length-1);
        System.out.println(JSON.toJSONString(a));
    }
}
