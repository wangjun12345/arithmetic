package com.wac.arithmetic.primary.linklist;

/**
 * @author wj
 * @Description: 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点
 * @date 2021/6/24 10:43 上午
 */
public class LL2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
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

        ListNode rs = t1(node1, 2);
        System.out.println(rs);
    }

    private static ListNode t1(ListNode head, int n) {
        int len = getLen(head);
        int ascIndex = len -n;
        if(ascIndex == 0){
            return head.next;
        }
        ListNode node = head;
        for (int i = 0; i < ascIndex - 1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        return head;
    }

    private static int getLen(ListNode head) {
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }

}
