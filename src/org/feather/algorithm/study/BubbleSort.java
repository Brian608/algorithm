package org.feather.algorithm.study;

/**
 * @program: algorithm
 * @description:冒泡排序
 * @author: 杜雪松(feather)
 * @since: 2021-12-26 11:15
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={8,5,7,3,9,1,4,2,6};
        arraySort(arr);
        CommonUtils.print(arr);
    }

    public static void arraySort(int[] arr) {
        for (int i = arr.length-1; i>0 ; i--) {
           findMax(arr,i);
        }
    }
    static  void  findMax(int[] arr,int n){
        for (int j = 0; j <n ; j++) {
            if (arr[j]>arr[j+1]){
                CommonUtils.swap(arr,j,j+1);
            }
        }
    }
}
