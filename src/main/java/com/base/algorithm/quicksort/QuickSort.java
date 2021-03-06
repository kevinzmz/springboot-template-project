package com.base.algorithm.quicksort;

import com.alibaba.fastjson.JSON;

import java.util.Random;

/**
 * @auther kevin
 * @date 2020/6/29 16:10
 */
public class QuickSort {
    public static void quickSort(int []a,int i,int j){
        Random r = new Random();
        int n = j;

        if(j>i){
            int ran = r.nextInt(j-i) + i;
            int tempRan = a[n];
            a[n] = a[tempRan];
            a[tempRan] = tempRan;
        }

        if(i < j-1){
            n = j;
            int t = i-1;
            int m = i;
            while(m<j){
                if(a[m]<a[n]){
                    int temp = a[m];
                    a[m] = a[t+1];
                    a[t+1] = temp;
                    t++;
                    m++;
                }else{
                    m++;
                }
            }
            int tempSec = a[n];
            a[n]=a[t+1];
            a[t+1]=tempSec;
            quickSort(a,i,t);
            quickSort(a,t+2,n);
        }else if(i == j-1){
            if(a[i] > a[j]){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }

    public static void quickSortSec(int []a,int left,int right){
        int i=left;
        int j=right;
        int temp = a[left];
        while(left < right){
            while(temp < a[right]){
                right--;
            }
                a[left] = a[right];
            while(temp > a[left]){
                left++;
            }
            a[right] = a[left];
        }
        a[left] = temp;
        quickSort(a,i,left-1);
        quickSort(a,left+1,j);
    }

    public static void main(String[] args) {
        int []input = {4,1,6,2,7,8,2,9,0,7};
        quickSort(input,0,input.length-1);
        System.out.println(JSON.toJSONString(input));

        int []sec= {4,1,6,2,7,8,2,9,0,7};
        quickSort(sec,0,sec.length-1);
        System.out.println(JSON.toJSONString(sec));
    }
}
