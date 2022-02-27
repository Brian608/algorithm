package org.feather.algorithm.datastruts.line;

import org.feather.algorithm.leetcode.mergeTwoLists;

/**
 * @program: algorithm
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2022-02-27 08:53
 **/
public class Node {
    int id;
    String name;

    //下一个节点
    Node next;

    Node(int id,String name) { this.id = id; this.name=name ;}

    @Override
    public String toString() {
        return "Node{" + "id=" + id + ", name='" + name + '\'' + '}';
    }


}
