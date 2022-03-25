package org.feather.algorithm.sort;

/**
 * @program: algorithm
 * @description:冒泡排序
 * @author: 杜雪松(feather)
 * @since: 2022-03-25 22:54
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int [] nums={5,8,6,3,9,2,1,7};
        //循环的次数
        for (int i=0;i<nums.length-1;i++){
            //默认是排好的
            boolean isSort=true;
            //两两比较  已经移到右测就不需要比较
            for (int j = 0; j <nums.length -1-i; j++) {
                int tmp=0;
                if (nums[j]>nums[j+1]){
                    isSort=false;
                    //大的右移  交换
                    tmp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tmp;
                }
            }
            //排好则跳出
            if (isSort) {
                break;
            }
        }
        for (int n:
            nums ) {
            System.out.println(n);
        }

    }
}
