package com.wac.arithmetic.primary.tree;

import apple.laf.JRSUIUtils;

/**
 * @author wj
 * @Description: 将有序数组转换为二叉搜索树
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树
 * @date 2021/7/1 11:33 上午
 */
public class Tree5 {

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

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        System.out.println(5 >> 1);
        System.out.println(-13/2);
        TreeNode treeNode = sortedArrayToBST(nums);
        System.out.println(treeNode);
    }

    /**
     * 折半为根结点
     * @param nums
     * @return
     */
    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        return dg(nums, 0, nums.length - 1);
    }

    private static TreeNode dg(int[] nums, int start, int end) {
        if(start > end){
            return null;
        }
        int rootIndex = (end + start) / 2;
        TreeNode root = new TreeNode(nums[rootIndex]);
        root.left = dg(nums, start, rootIndex - 1);
        root.right = dg(nums, rootIndex + 1, end);
        return root;
    }
}
