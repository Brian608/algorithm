package org.feather.algorithm.alth.ra;

/**
 * @program: algorithm
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2022-03-09 21:09
 **/
public class HelloWorld {
    public  static  void  print(int n,String s){
        if (n<1) {
            return;
        }
        System.out.println(s);
        print(n-1,s);
    }
    public static void main(String[] args) {
            print(5,"hello World");
    }
}
