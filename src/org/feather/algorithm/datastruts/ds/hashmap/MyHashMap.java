package org.feather.algorithm.datastruts.ds.hashmap;


/**
 * @program: algorithm
 * @description:手写hashmap
 * @author: 杜雪松(feather)
 * @since: 2022-03-01 08:28
 **/
public class MyHashMap {
    /**
     * 数组初始化 2 的n次方
     */
    ListNode [] map=new ListNode[8];
    /**
     * listNode的个数
     */
    int size;

    /**
     * 设置值
     * @param key
     * @param value
     */
    public  void  put(String key,String value){
        // 该扩容了
        double tmp=map.length*0.75;
        if (size>=tmp){
            System.out.println("map需要扩容");
            return;
        }
        //计算索引下标
        int index=Math.abs(key.hashCode())%map.length;
        ListNode ln=map[index];

        //判断该下标下有无值
        if (ln==null){
            //创建单链表
            ListNode lnNew=new ListNode();
            //创建头节点
            Node head=new Node(key,value,null);
            //挂载头节点
            lnNew.head=head;
            //把单链放数组里
            map[index]=lnNew;
            size++;
        }else {
            //该下标有值，hash碰撞
            //单链表挂节点
            ln.addNode(key,value);
        }



    }

    /**
     * 取值
     * @param key
     * @return
     */
    public  String get(String key){
        int index = Math.abs(key.hashCode()) % map.length;
        ListNode listNode = map[index];
        if (listNode==null) {
            return "";
        }
        return  listNode.getVal(key);
    }

    public static void main(String[] args) {
        MyHashMap hashMap=new MyHashMap();
        hashMap.put("name","dxs");
        System.out.println(hashMap.get("name"));
    }
}
