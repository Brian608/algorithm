package org.feather.algorithm.datastruts.line;

/**
 * @program: algorithm
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2022-02-27 08:51
 **/
public class SingleLinkedList {
    /**
     * 初始化头节点
     */
    private Node node = new Node(0, "");

    /***
     * 添加节点：从头插入
     * **
     * @param node
     * */
    public  void  addNode(Node node){
        //从头插入
        Node tmp=node;
        while (true){
            if (node.next==null){
                break;
            }
            //后移
            node.next=tmp;
        }
        tmp.next=node;
    }

    public  void  addByIdOrder(Node node){
        //从头插入
        Node tmp=node;
        while (true){
            //到尾节点
            if (tmp.next==null){
                break;
            }
            //如果节点存在
            if (tmp.next.id==node.id){
                break;
            }
            if (tmp.next.id> node.id){
                break;
            }
            tmp=tmp.next;
        }
        //交换位置
        node.next=tmp.next;
        tmp.next=node;

    }

    public  void  showList(){
        if (node.next==null){
            System.out.println("链表为空");
            return;
        }
        Node tmp=node.next;
        while (true){
            if (tmp==null){
                return;
            }
            System.out.println(tmp);
            //指针下移
            tmp=tmp.next;
        }
    }

    public static void main(String[] args) {
        Node n1=new Node(1,"张飞");
        Node n2=new Node(2,"关羽");
        Node n3=new Node(3,"赵云");
        Node n4=new Node(4,"黄忠");
        Node n5=new Node(5,"马超");
        SingleLinkedList sll=new SingleLinkedList();
        sll.addByIdOrder(n4);
        sll.addByIdOrder(n5);
        sll.addByIdOrder(n1);
        sll.addByIdOrder(n2);
        sll.addByIdOrder(n3);
        sll.showList();
    }

}
