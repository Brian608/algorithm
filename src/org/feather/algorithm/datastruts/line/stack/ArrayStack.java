package org.feather.algorithm.datastruts.line.stack;

/**
 * @program: algorithm
 * @description:数组实现栈
 * @author: 杜雪松(feather)
 * @since: 2022-02-27 15:22
 **/
public class ArrayStack {
    //数组
      private  int [] nums;
      //栈中的个数
      private  int count;

    /**
     *初始化数组 申请一个大小为n的数组
     * @param n
     */
    public  ArrayStack(int n){
          this.nums=new  int[n];
          this.count=0;
      }

    /**
     * 入栈操作
     * @param n
     * @return
     */
      public  boolean push(int n ){
          //数组空间不够了，直接返回false，入栈失败。 没有扩容
        if (count>=nums.length) {
            return  false;
        }
        //将item放到下标为count的位置，并且count加一
        nums[count]=n;
        count++;
        return true;
      }

    /**
     * 出栈
     * @return
     */
    public  int pop( ){
        //栈为空，直接返回0
        if (count == 0) {
            return  0;
        }
        //返回下标为count-1的数组元素，并且栈中元素个数count减一
        int  n=nums[count-1];
        count--;
        return n;
      }

    public static void main(String[] args) {
        ArrayStack arrayStack=new ArrayStack(8);
        arrayStack.push(3);
        arrayStack.push(5);
        arrayStack.push(4);
        arrayStack.push(2);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
    }




}
