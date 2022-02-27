package org.feather.algorithm.datastruts.line;

import org.w3c.dom.Node;

/**
 * @program: algorithm
 * @description:链表实现栈
 * @author: 杜雪松(feather)
 * @since: 2022-02-27 17:47
 **/
public class LinedStack {
    int size;
    //头节点
    Node3 head;

    public  LinedStack (){
        head=null;
        size=0;
    }

    /**
     * 入栈
     * @param node3
     */
    public  void  push(Node3 node3){
        if (size==0){
            head=node3;
        }else {//非head
            node3.next=head;
            head=node3;
        }
        size++;
    }

    public  Node3 pop(){
        if (size>0){
            Node3 oldNode=head;
            head=head.next;
            size--;
            return oldNode;
        }else {
            return  null;
        }
    }

    public static void main(String[] args) {
        Node3 node1=new Node3(3);
        Node3 node2=new Node3(5);
        Node3 node3=new Node3(4);
        Node3 node4=new Node3(1);

        LinedStack linedStack=new LinedStack();
        linedStack.push(node1);
        linedStack.push(node2);
        linedStack.push(node3);
        linedStack.push(node4);

        System.out.println(linedStack.pop().value);
        System.out.println(linedStack.pop().value);
        System.out.println(linedStack.pop().value);
        System.out.println(linedStack.pop().value);
    }
}
