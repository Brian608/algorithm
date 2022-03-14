package org.feather.algorithm.alth.half;

/**
 * @program: algorithm
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2022-03-15 07:15
 **/
public class HalfDemo2 {
    private  static  int bsearchUnit(int []nums ,int low ,int high,int n){
        //没找到
        if (low>high) {
            return  -1;
        }
        int mid =(low+high)/2;
        //找到了
        if (nums[mid]==n){
            return  mid;
        }else  if (nums[mid]<n){
            return  bsearchUnit(nums,mid+1,high,n);
        }else {
            return  bsearchUnit(nums,low,mid-1,n);
        }

    }

    /**
     * 查找
     * @param nums 有序数组
     * @param num 数组的最大个数
     * @param n 要找的数字
     * @return
     */
    public  static  int binarySearch(int [] nums,int num ,int n){
        return  bsearchUnit(nums,0,num-1,n);
    }

    public static void main(String[] args) {
        int []nums= {1,3,5,7,9,12,15,18,20};
        System.out.println(binarySearch(nums,9,18));
    }
}
