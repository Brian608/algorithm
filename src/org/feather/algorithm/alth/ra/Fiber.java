package org.feather.algorithm.alth.ra;

/**
 * @program: algorithm
 * @description:斐波那契数列
 * @author: 杜雪松(feather)
 * @since: 2022-03-11 08:09
 **/
public class Fiber {
    public  static  int fun(int n){
        if ( n<=1){
            return  n;
        }
        return  fun(n-1)+fun(n-2);
    }

    public static void main(String[] args) {
        System.out.println( fun(8));
    }

}
