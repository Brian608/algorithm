package org.feather.algorithm.datastruts.line;

/**
 * @program: algorithm
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2022-02-27 15:18
 **/
public class Node2 {
    int id;

    String name;

    Node2 next;

    Node2 prev;

    public  Node2(int id ,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Node2{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }
}
