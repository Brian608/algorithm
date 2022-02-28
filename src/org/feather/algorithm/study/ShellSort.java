package org.feather.algorithm.study;

/**
 * @program: algorithm
 * @description:希尔排序
 * @author: 杜雪松(feather)
 * @since: 2021-12-26 17:52
 **/
public class ShellSort {
    public static void main(String[] args) {
        int[] arr ={8,5,7,3,9,1,4,2,6};
        sort(arr);
        CommonUtils.print(arr);
    }
   public static  void sort(int [] arr){
//        nuth序列
//       h=1
//       h=h*3+1;
        int h=1;
        while (h<=arr.length/3){
            h=h*3+1;
        }
       for (int gap = h; gap >0 ; gap=(gap-1)/3) {
           for (int i = gap; i <arr.length ; i++) {
               for (int j = i; j >gap-1 ; j-=gap) {
                   if (arr[j]<arr[j-gap]){
                       CommonUtils.swap(arr,j,j-gap);
                   }
               }
           }
       }
    }
}
