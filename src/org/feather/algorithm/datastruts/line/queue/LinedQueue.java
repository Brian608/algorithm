package org.feather.algorithm.datastruts.line.queue;

/**
 * @program: algorithm
 * @description:链表实现队列
 * @author: 杜雪松(feather)
 * @since: 2022-02-28 08:20
 **/
public class LinedQueue {
    Node head;
    Node tail;
    int size;

    /**
     * 入队
     * @param node
     */
    public  void  enqueue(Node node){
        if (tail==null){
            head=node;
            tail=head;
        }else {
            tail.next=node;
            tail=head;
        }
        size++;
    }
    public  Node  dequeue(){
        if (head==null) {
            return null;
        }
        Node h=head;
        //将拉取的节点的下一个节点变成新的表头
        head=head.next;
        //把旧的表头的下一个节点指向设置为null，让gc回收
        h.next = null;
        //队列为空
        if (head == null) {
            tail = null;
        }
        size--;
        return h;
    }

    public static void main(String[] args) {
        Node node1=new Node(3);
        Node node2=new Node(5);
        Node node3=new Node(1);
        Node node4=new Node(4);

        LinedQueue linedQueue=new LinedQueue();
        linedQueue.enqueue(node1);
        linedQueue.enqueue(node2);
        linedQueue.enqueue(node3);
        linedQueue.enqueue(node4);

        System.out.println(linedQueue.dequeue().value);
        System.out.println(linedQueue.dequeue().value);
        System.out.println(linedQueue.dequeue().value);
        System.out.println(linedQueue.dequeue().value);


    }
}
