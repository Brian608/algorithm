package org.feather.algorithm.binarytree;

/**
 * @program: algorithm
 * @description:二叉查找树
 * @author: 杜雪松(feather)
 * @since: 2022-03-22 07:28
 **/
public class BinarySearchTree {
    //根节点
    TreeNode root;

    //插入数据
    public  void insertNode(int data){
        root=insert(root,data);
    }
//递归插入
    private TreeNode insert(TreeNode node,int data){
        //结束条件
        if (node==null) {
            return new TreeNode(data);
        }
        //左孩子
        if (data< node.data){
             node.leftChild=insert(node.leftChild,data);
        }else  if(data> node.data){//右孩子
            node.rightChild=insert(node.rightChild,data);
        }else {
            node.data=data;
        }
        return node;
    }

    /**   根  左  右
     * 前序遍历---递归
     * @param node
     */
    public   void beforeTraver(TreeNode node){
        //结束条件
        if (node==null){
            return;
        }
        //节点
        System.out.println(node.data);
        //左孩子
        beforeTraver(node.leftChild);
        //右孩子
        beforeTraver(node.rightChild);
    }

    /**
     * 中序遍历  左 根 右
     * @param node
     */
    public  void midTraver(TreeNode node){
        if (node==null){
            return;
        }
        //左孩子
        midTraver(node.leftChild);
        //根节点
        System.out.println(node.data);
        //右孩子
        midTraver(node.rightChild);
    }

    /**
     * 后序遍历  左  右  根
     * @param node
     */
    public void afterTraver(TreeNode node){
        if (node==null){
            return;
        }
        //左孩子
         afterTraver(node.leftChild);
        //右孩子
        afterTraver(node.rightChild);
        //根节点
        System.out.println(node.data);

    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.insertNode(10);
        binarySearchTree.insertNode(8);
        binarySearchTree.insertNode(11);
        binarySearchTree.insertNode(7);
        binarySearchTree.insertNode(9);
        binarySearchTree.insertNode(12);
        System.out.println("======前序遍历=======");
        //前序遍历
        binarySearchTree.beforeTraver(binarySearchTree.root);
        System.out.println("======中序遍历=======");
        binarySearchTree.midTraver(binarySearchTree.root);

        System.out.println("======后序遍历=======");
        binarySearchTree.afterTraver(binarySearchTree.root);
    }
}
