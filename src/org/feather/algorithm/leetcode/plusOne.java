package org.feather.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: algorithm
 * @description:
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 *
 *
 * 示例1：
 *
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 * 示例2：
 *
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 * 示例 3：
 *
 * 输入：digits = [0]
 * 输出：[1]
 *
 *
 * 提示：
 *
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: 杜雪松(feather)
 * @since: 2022-03-17 11:06
 **/
public class plusOne {
    public static int[] plusOne(int[] digits) {
        int plusOne=digits[digits.length - 1] + 1;
        if (plusOne==10){
            int[] arr = new int[digits.length+1];
            for (int i = 0; i <digits.length-1; i++) {
                if (digits[i]==9){
                    arr[i]=1;
                    arr[i+1]=0;
                }else {
                    arr[i]=digits[i];
                }
            }
            return  arr;
        }else{
            digits[digits.length-1]=plusOne;
            return  digits;
        }


    }

    public static void main(String[] args) {
        int [] nums={9,9};
        int[] plusOneArray = plusOne(nums);
        for (int num:
                plusOneArray ) {
            System.out.println(num);
        }
    }
}
