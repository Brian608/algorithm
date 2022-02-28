package org.feather.algorithm.study;

/**
 * @program: algorithm
 * @description:选择排序
 * @author: 杜雪松(feather)
 * @since: 2021-12-25 21:26
 **/
public class SelectionSort {
    public static int [] selectionSort(int [] arr){
        for (int i = 0; i <arr.length -1; i++) {
            int minPos=i;
            for (int j = i+1; j <arr.length ; j++) {
                minPos=arr[j]<arr[minPos]?j:minPos;
            }
           CommonUtils.swap(arr,i,minPos);
        }
        return  arr;
    }

    public static void main(String[] args) {
        int[] arr ={8,5,7,3,9,1,4,2,6};
        int[] newArrays = selectionSort(arr);
       CommonUtils.print(newArrays);
    }
 }
