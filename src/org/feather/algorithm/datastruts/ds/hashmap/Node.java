package org.feather.algorithm.datastruts.ds.hashmap;

/**
 * @program: algorithm
 * @description:节点
 * @author: 杜雪松(feather)
 * @since: 2022-03-01 08:23
 **/
public class Node {
    String key;
    String value;
    Node next;

    public Node(String key, String value, Node next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
