package org.feather.algorithm.datastruts.ds.hashmap;

/**
 * @program: algorithm
 * @description:单链表
 * @author: 杜雪松(feather)
 * @since: 2022-03-01 08:25
 **/
public class ListNode {
    Node head;

    /**
     * 添加单链表节点
     * @param key
     * @param value
     */
    public  void  addNode(String key,String value){
        //在外界设置好了 head
        if (head==null) {
            return;
        }
        //创建节点
        Node node=new Node(key,value,null);
        //临时变量
        Node tmp=head;
        //循环单链表
        while (head!=null){
            //key相同则覆盖
            if (key.equals(tmp.key)){
                tmp.value=value;
            }else {
                //key不同
                //挂载到下一个
                tmp.next=node;
            }
            //指向下一个
            tmp=tmp.next;

        }

    }

    /**
     *
     * @param key
     * @return
     */
    public  String getVal(String key){
        if (head==null) {
            return null;
        }
        if (head.next==null){
            return  head.value;
        }
        Node tmp=head;
        //遍历单链表
        while (tmp!=null){
            //找到匹配的key
            if (tmp.next.equals(key)){
                return tmp.value;
            }
            // 指向下一个
            tmp=tmp.next;
        }
       return  null;
    }
}
