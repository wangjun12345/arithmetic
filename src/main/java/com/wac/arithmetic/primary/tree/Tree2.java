package com.wac.arithmetic.primary.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wj
 * @Description: 验证二叉搜索树
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * @date 2021/6/30 9:44 上午
 */
public class Tree2 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(6);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;


        boolean rs = isValidBST(node1);
        System.out.println(rs);
    }

    private static boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getListForMiddle(root, list);
        if(list.size() == 0){
            return true;
        }
        int temp = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(temp >= list.get(i)){
                return false;
            }
            temp = list.get(i);
        }
        return true;
    }

    private static void getListForMiddle(TreeNode root, List<Integer> list) {
        if(root == null){
            return;
        }
        getListForMiddle(root.left, list);
        list.add(root.val);
        getListForMiddle(root.right, list);
    }
}
