package com.wac.arithmetic.primary.linklist;


/**
 * @author wj
 * @Description: 删除链表中的节点
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。传入函数的唯一参数为 要被删除的节点 。
 * @date 2021/6/23 4:02 下午
 */
public class LL1 {
    public static class ListNode {
        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

        public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        t1(node2);
    }

    private static void t1(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
