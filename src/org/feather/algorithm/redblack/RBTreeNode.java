package org.feather.algorithm.redblack;

/**
 * @program: algorithm
 * @description:红黑树节点
 * @author: 杜雪松(feather)
 * @since: 2022-03-24 22:37
 **/
public class RBTreeNode {
  private int key;
  private boolean isBlack;
  private RBTreeNode left;
  private RBTreeNode right;
  private  RBTreeNode parent;

  public RBTreeNode(int key) {
    this.key = key;
    isBlack=false;// 新增节点默认为红色
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public boolean isBlack() {
    return isBlack;
  }

  public void setBlack(boolean black) {
    isBlack = black;
  }

  public RBTreeNode getLeft() {
    return left;
  }

  public void setLeft(RBTreeNode left) {
    this.left = left;
  }

  public RBTreeNode getRight() {
    return right;
  }

  public void setRight(RBTreeNode right) {
    this.right = right;
  }

  public RBTreeNode getParent() {
    return parent;
  }

  public void setParent(RBTreeNode parent) {
    this.parent = parent;
  }

  @Override
  public String toString() {
    return "RBTreeNode{" +
            "key=" + key +
            ", isBlack=" + (isBlack==true?"BLACK":"RED") +
            '}';
  }
}
