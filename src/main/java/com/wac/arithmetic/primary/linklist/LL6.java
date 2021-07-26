package com.wac.arithmetic.primary.linklist;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wj
 * @Description: 环形链表
 * 给定一个链表，判断链表中是否有环。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * 如果链表中存在环，则返回 true 。 否则，返回 false 。
 * @date 2021/6/28 10:25 上午
 */
public class LL6 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
          val = x;
          next = null;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;
//        boolean rs = t1(node1);
        boolean rs = t2(node1);
        System.out.println(rs);
    }

    private static boolean t1(ListNode head) {
        Map<String, Integer> map = new HashMap<>();
        int index = 0;
        while(head != null){
            if(map.containsKey(head.toString())){
                System.out.println(map.get(head.toString()));
                return true;
            }
            map.put(head.toString(), index++);
            head = head.next;
        }
        return false;
    }

    /**
     * 快慢指针  快指针每次走一步，慢指针每次走两步，看是否能相遇
     */
    private static boolean t2(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode quick = head;
        ListNode slow = head;
        while(quick != null && quick.next != null){
            slow = slow.next;
            quick = quick.next.next;
            if(slow == quick){
                return true;
            }
        }
        return false;
    }


}
