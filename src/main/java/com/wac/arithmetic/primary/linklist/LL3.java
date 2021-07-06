package com.wac.arithmetic.primary.linklist;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author wj
 * @Description: 反转链表 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * @date 2021/6/25 9:30 上午
 */
public class LL3 {

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
//        ListNode rs = t3(node1);
//        ListNode rs = t2(node1);
//        ListNode rs = t1(node1);
//        System.out.println(rs);


        System.out.println(node1);

        ListNode temp = node1;
        temp = node4;
//        ListNode temp = node1.next;
//        node1.next = null;//这里是将node1的next属性置为null，而不是将node2置为null
        System.out.println(temp);
        System.out.println(node1);

    }

    private static ListNode t1(ListNode head) {
        if(head == null){
            return null;
        }
        List<ListNode> list = new ArrayList<>();
        while(head != null){
            list.add(new ListNode(head.val));
            head = head.next;
        }
        ListNode rs = list.get(list.size() - 1);
        ListNode tempNode = rs;
        for (int i = list.size() - 2; i >= 0; i--) {
            tempNode.next = list.get(i);
            tempNode = tempNode.next;
        }
        return rs;
    }

    //栈
    private static ListNode t2(ListNode head) {
        if(head == null){
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while(head != null){
            stack.push(head);
            head = head.next;
        }
        head = stack.pop();
        ListNode temp = head;
        while(!stack.isEmpty()){
            temp.next = stack.pop();
            temp = temp.next;

        }
        temp.next = null;
        return head;
    }

    //双链表 把原链表的结点一个个摘掉，每次摘掉的链表都让他成为新的链表的头结点
    private static ListNode t3(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode rs = null;
        ListNode temp;
        while(head != null){
            temp = head.next;
            head.next = rs;
            rs = head;
            head= temp;
        }
        return rs;
    }
}
