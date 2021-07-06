package com.wac.arithmetic.primary.tree;

/**
 * @author wj
 * @Description: 树的遍历
 * @date 2021/7/1 9:13 上午
 */
public class TreeCycle {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode parent;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }

        public TreeNode(int val, TreeNode left, TreeNode right, TreeNode parent) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }
    }

    /**
     * 前序遍历 中左右
     */
    public void beforeOrder(TreeNode node){
        if(node == null){
            return;
        }
        System.out.println(node.val);
        beforeOrder(node.left);
        beforeOrder(node.right);
    }

    /**
     * 中序遍历 左中右
     */
    public void middleOrder(TreeNode node){
        if(node == null){
            return;
        }
        middleOrder(node.left);
        System.out.println(node.val);
        middleOrder(node.right);
    }
    /**
     * 前序遍历 左右中
     */
    public void afterOrder(TreeNode node){
        if(node == null){
            return;
        }
        afterOrder(node.left);
        afterOrder(node.right);
        System.out.println(node.val);
    }
}
