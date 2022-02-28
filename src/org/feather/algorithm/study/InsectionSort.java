package org.feather.algorithm.study;

/**
 * @program: algorithm
 * @description:插入排序
 * @author: 杜雪松(feather)
 * @since: 2021-12-26 17:01
 **/
public class InsectionSort {
    public static void main(String[] args) {
        int[] arr ={8,5,7,3,9,1,4,2,6};
        sort(arr);
        CommonUtils.print(arr);
    }
   static void sort(int [] arr) {
       for (int i = 0; i <arr.length ; i++) {
           for (int j = i; j >0; j--)
               if (arr[j] < arr[j - 1]) {
                   CommonUtils.swap(arr, j, j - 1);
               }
       }
    }

}
