package org.feather.algorithm.binarytree;

import java.util.TreeMap;

/**
 * @program: algorithm
 * @description:树的节点
 * @author: 杜雪松(feather)
 * @since: 2022-03-22 07:25
 **/
public class TreeNode {
    //值
    int data;
    //左孩子
    TreeNode  leftChild;

    //右孩子
    TreeNode rightChild;

    public TreeNode (int data) {
        this.data=data;
    }
}
