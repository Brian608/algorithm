package org.feather.algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * @program: algorithm
 * @description:算法验证
 * @author: 杜雪松(feather)
 * @since: 2021-12-26 10:46
 **/
public class DataChecker {
    static  int [] generateRandomArray(){
        Random random=new Random();
        int [] arr=new int[10000];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=random.nextInt(10000);
        }
        return  arr;
    }
    static  boolean  check(){
        int[] arr = generateRandomArray();
        int [] arr1=new int[arr.length];
        System.arraycopy(arr,0,arr1,0,arr.length);
        Arrays.sort(arr);
        SelectionSort.selectionSort(arr1);
        boolean result=true;
        for (int i = 0; i <arr1.length ; i++) {
            if (arr[i] != arr[1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
