package com.wac.arithmetic.primary.linklist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author wj
 * @Description: 两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
 * @date 2021/6/25 10:49 上午
 */
public class LL4 {

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
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node4;
        node4.next = node5;

        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node6 = new ListNode(6);
        node2.next = node3;
        node3.next = node6;

        ListNode rs = t1(node1, node2);
        System.out.println(rs);
    }

    private static ListNode t1(ListNode l1, ListNode l2) {
        if(l1 != null && l2 != null){
            List<ListNode> list1 = new ArrayList<>();
            while(l1 != null){
                list1.add(new ListNode(l1.val));
                l1 = l1.next;
            }
            List<ListNode> list2 = new ArrayList<>();
            while(l2 != null){
                list2.add(new ListNode(l2.val));
                l2 = l2.next;
            }
            list1.addAll(list2);
            list1.sort((o1, o2) -> o1.val - o2.val);
            ListNode rs = list1.get(0);
            ListNode temp = rs;
            for (int i = 1; i < list1.size(); i++) {
                temp.next = list1.get(i);
                temp = temp.next;
            }
            return rs;
        }else if(l1 == null){
            return l2;
        }else {
            return l1;
        }
    }
}
