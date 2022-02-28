package org.feather.algorithm.study;

/**
 * @program: algorithm
 * @description:常用方法
 * @author: 杜雪松(feather)
 * @since: 2021-12-26 11:18
 **/
public class CommonUtils {

    static  void  swap(int [] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static  void  print(int [] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
