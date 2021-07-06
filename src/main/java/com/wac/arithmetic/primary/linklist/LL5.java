package com.wac.arithmetic.primary.linklist;

import java.util.Stack;

/**
 * @author wj
 * @Description: 请判断一个链表是否为回文链表
 * @date 2021/6/25 7:41 下午
 */
public class LL5 {

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
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        boolean rs = t1(node1);
        System.out.println(rs);
    }

    private static boolean t1(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            stack.push(temp);
            temp = temp.next;
        }

        while(!stack.isEmpty()){
            if(stack.pop().val != head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
