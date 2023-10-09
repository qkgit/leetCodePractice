package editor.cn;
//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。 
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。 
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 
//
// 示例 1： 
// 
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
// 
//
// 示例 2： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 每个链表中的节点数在范围 [1, 100] 内 
// 0 <= Node.val <= 9 
// 题目数据保证列表表示的数字不含前导零 
// 
//
// Related Topics 递归 链表 数学 👍 9658 👎 0


class AddTwoNumbers{

    public static void main(String[] args) {
        Solution solution = new AddTwoNumbers().new Solution();
        ListNode listNode = solution.addTwoNumbers(new AddTwoNumbers().new ListNode(5), new AddTwoNumbers().new ListNode(5));
    }


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 初始化第一位
        int i =l1.val+ l2.val;
        ListNode returnNode = new ListNode(i%10);
        // 进位
        int carry = (l1.val+ l2.val)/10;



        ListNode next1 = l1.next;
        ListNode next2 = l2.next;

        ListNode node = new ListNode();

        if (next1!=null || next2!=null ){
            returnNode.next = new ListNode();
            node = returnNode.next;
        }


        while (next1 != null || next2 != null){
            if (next1 == null){
                next1 = new ListNode();
            }
            if (next2 == null){
                next2 = new ListNode();
            }

            i = next1.val + next2.val + carry;
            // 对当前节点进行赋值
            // 当前节点取和的个位+前一节点的进位
            node.val = (i%10);
            carry = i/10;

            if (next1.next!=null || next2.next!=null){
                node.next = new ListNode();
                node = node.next;
            }


            // 匹配循环条件
            next1 = next1.next;
            next2 = next2.next;
        }

        if (carry!=0){
            ListNode endNode = new ListNode(carry);
            if (returnNode.next!=null){
                node.next = endNode;
            }else {
                returnNode.next = endNode;
            }

        }

        return returnNode;
    }

}


//leetcode submit region end(Prohibit modification and deletion)

    class ListNode{
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }



}