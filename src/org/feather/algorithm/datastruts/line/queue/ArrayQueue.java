package org.feather.algorithm.datastruts.line.queue;

/**
 * @program: algorithm
 * @description:数组实现队列
 * @author: 杜雪松(feather)
 * @since: 2022-02-28 08:07
 **/
public class ArrayQueue {

    int nums[];
    //头下标
    int head=0;
    //尾下标
    int tail=0;

    public  ArrayQueue(int size){
        nums =new  int[size];
    }

    /**
     * 入队
     * @param n
     * @return
     */
    public  boolean enquese(int n){
        //队列已满
        if (tail==n){
            return  false;
        }
        nums[tail]=n;
        ++tail;
        return  true;
    }

    /**
     * 出队
     * @param n
     * @return
     */
    public  int dequese(){
        //队列为空
        if (head==tail){
            return  0;
        }
        int tmp=nums[head];
        ++head;
        return  tmp;
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue=new ArrayQueue(8);
        arrayQueue.enquese(3);
        arrayQueue.enquese(5);
        arrayQueue.enquese(1);
        arrayQueue.enquese(4);

        System.out.println(arrayQueue.dequese());
        System.out.println(arrayQueue.dequese());
        System.out.println(arrayQueue.dequese());
        System.out.println(arrayQueue.dequese());
    }
}
