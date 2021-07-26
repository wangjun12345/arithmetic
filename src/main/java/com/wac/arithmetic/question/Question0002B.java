package com.wac.arithmetic.question;

import java.util.Stack;

/**
 * @author wj
 * @Description: 两数相加
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * @date 2021/7/19 9:02 上午
 */
public class Question0002B {

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
        ListNode l1 = new ListNode(9);
//        ListNode l3 = new ListNode(6);
//        ListNode l4 = new ListNode(8);
//        l1.next = l3;
//        l3.next = l4;
        ListNode l2 = new ListNode(1);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(9);
        l2.next = l5;
        l5.next = l6;
        ListNode rs = t1(l1, l2);
        System.out.println(rs);
    }

    private static ListNode t1(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null){
            return null;
        }
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while(l1 != null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        while(!stack1.isEmpty()){
            s1.append(stack1.pop());
        }
        while(!stack2.isEmpty()){
            s2.append(stack2.pop());
        }
        if(s1.length() > s2.length()){
            int lenC = s1.length() - s2.length();
            while(lenC > 0){
                s2.insert(0, "0");
                lenC--;
            }
        }else if(s1.length() < s2.length()){
            int lenC = s2.length() - s1.length();
            while(lenC > 0){
                s1.insert(0, "0");
                lenC--;
            }
        }
        StringBuilder sumStr = new StringBuilder();
        char[] chars1 = s1.toString().toCharArray();
        char[] chars2 = s2.toString().toCharArray();
        boolean isJW = false;
        int len = chars1.length;
        for (int i = len - 1; i >= 0; i--) {
            int tempSum = 0;
            int i1 = chars1[i] - '0' + chars2[i] - '0';
            if(isJW){
                tempSum = i1 + 1;
            }else{
                tempSum = i1;
            }
            int insertValue = tempSum;
            isJW = false;
            if(tempSum > 9){
                isJW = true;
                insertValue = tempSum - 10;
            }
            sumStr.insert(0, insertValue);
        }
        if(isJW){
            sumStr.insert(0, "1");
        }
        char[] chars = sumStr.toString().toCharArray();
        ListNode rs = new ListNode(chars[chars.length - 1] - '0');
        ListNode temp = rs;
        for (int i = chars.length - 2; i >= 0; i--) {
            temp.next = new ListNode(chars[i] - '0');
            temp = temp.next;
        }
        return rs;
    }

}
