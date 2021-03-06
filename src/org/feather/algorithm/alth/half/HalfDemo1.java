package org.feather.algorithm.alth.half;

/**
 * @program: algorithm
 * @description:在有序数组中找到某个数的位置
 * @author: 杜雪松(feather)
 * @since: 2022-03-14 07:35
 **/
public class HalfDemo1 {

    public  static  int binarySearchCommon(int [] nums ,int n){
        //低位索引
        int low=0;
        //高位索引
        int hight=nums.length-1;
        //中间索引
        int mid=0;
        //可查找
        while (low<=hight){
       mid=(low+hight)/2;
        if (n==nums[mid]){
            return  mid;
        }else if (n>nums[mid]){
            low=mid+1;
        }else {
           // n< num[mids]
            hight=mid-1;
        }
        }
        return  -1;

    }

    public static void main(String[] args) {
        int []nums= {1,3,5,7,9,12,15,18,20};
        System.out.println(binarySearchCommon(nums,9));
    }

}
