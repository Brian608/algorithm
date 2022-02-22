package org.feather.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @program: algorithm
 * @description:给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标
 * @author: 杜雪松(feather)
 * @since: 2022-02-18 20:22
 **/
public class twoSum {

    public static int[] twoSum(int[] nums, int target) {
        int [] result =new int[2];
        for (int i = 0; i <nums.length ; i++) {
            for (int j = nums.length-1; j >i ; j--) {
               if (nums[i]+nums[j]==target){
                   result[0]=i;
                   result[1]=j;
                   return result;
               }
            }
        }
            return result;
    }
    public static int[] twoSum1(int[] nums, int target) {
        int [] result =new int[2];
    HashMap<Integer, Integer> map =new HashMap<>();
    for (int i=0;i<nums.length;i++){
        if (map.containsKey(nums[i])){
            result[0]=i;
            result[1]=map.get(nums[i]);
        }
        map.put(target-nums[i],i);
    }
        return result;
    }

    public static void main(String[] args) {
        int []nums = {2,7,11,15};
        long startTime= System.currentTimeMillis();
        int[] result = twoSum1(nums, 9);
        long endTime = System.currentTimeMillis();
        System.out.println("花费时间:"+(endTime-startTime)+"毫秒");
        for (int num:
             result) {
            System.out.print(num+" ");
        }
    }
}
