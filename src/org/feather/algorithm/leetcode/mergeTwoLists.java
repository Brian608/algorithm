package org.feather.algorithm.leetcode;

/**
 * @author feather
 * @projectName algorithm
 * @description: 
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 
 *
 * 示例 1：
 *
 *
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 示例 2：
 *
 * 输入：l1 = [], l2 = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 * 
 *
 * 提示：
 *
 * 两个链表的节点数目范围是 [0, 50]
 * -100 <= Node.val <= 100
 * l1 和 l2 均按 非递减顺序 排列
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @since 23-Feb-22 1:41 PM
 */
public class mergeTwoLists {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode now1 = list1;
        ListNode now2 = list2;
        ListNode now = new ListNode();
        ListNode head = now;
        while(now1!=null&&now2!=null){
            if (now1.val<now2.val){
                now.next = now1;
                now = now.next;
                now1 = now1.next;
            }else{
                now.next = now2;
                now = now.next;
                now2 = now2.next;
            }
        }
        while(now1!=null){
            now.next = now1;
            now = now.next;
            now1 = now1.next;
        }
        while(now2!=null){
            now.next = now2;
            now = now.next;
            now2 = now2.next;
        }
        return head.next;
    }

}
