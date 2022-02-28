package org.feather.algorithm.study;

/**
 * @program: algorithm
 * @description:递归
 * @author: 杜雪松(feather)
 * @since: 2021-12-26 20:23
 **/
public class recursion {
    public static void main(String[] args) {
        System.out.println(f(10));
    }
    public  static  long f(int n){
        if (n<1){
            return  -1;
        }
        if (n==1){
            return  1;
        }
        return  f(n-1)+n;
    }
}
