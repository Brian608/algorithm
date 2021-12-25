package org.feather.algorithm;

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
           swap(arr,i,minPos);
        }
        return  arr;
    }
    static  void  swap(int [] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int[] arr ={8,5,7,3,9,1,4,2,6};
        int[] newArrays = selectionSort(arr);
        for (int s:
            newArrays ) {
            System.out.print(s+" ");
        }

    }
 }
