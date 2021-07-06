package com.wac.arithmetic.primary.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wj
 * @Description: 对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的
 * @date 2021/7/1 9:21 上午
 */
public class Tree3 {

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
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(3);
        node1.left = node2;
        node2.left = node3;
        node3.right = node4;
        node1.right = node5;
        node5.left = node6;
        node5.right = node7;

        boolean rs = isSymmetric(node1);
        System.out.println(rs);

    }

    private static boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isLeftEqualRight(root.left, root.right);
    }

    private static boolean isLeftEqualRight(TreeNode left, TreeNode right) {
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null || left.val != right.val){
            return false;
        }
        return isLeftEqualRight(left.left, right.right) && isLeftEqualRight(left.right, right.left);
    }

}
