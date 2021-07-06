package com.wac.arithmetic.primary.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author wj
 * @Description: 二叉树的层序遍历
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 * @date 2021/7/1 9:53 上午
 */
public class Tree4 {

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
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        List<List<Integer>> lists = levelOrder(node1);
        System.out.println(lists);
    }

    private static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> rs = new ArrayList<>();
        if(root == null){
            return rs;
        }
        List<Integer> first = new ArrayList<>();
        first.add(root.val);
        rs.add(first);
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(root.left);
        nodeList.add(root.right);
        levelCycle(nodeList, rs);
        return rs;
    }

    private static void levelCycle(List<TreeNode> nodeList, List<List<Integer>> rs) {
        List<Integer> temp = new ArrayList<>();
        List<TreeNode> tempNodeList = new ArrayList<>();

        for (TreeNode treeNode : nodeList) {
            if(treeNode != null){
                temp.add(treeNode.val);
                tempNodeList.add(treeNode.left);
                tempNodeList.add(treeNode.right);
            }
        }
        if(temp.size() > 0){
            rs.add(temp);
        }
        if(temp.size() == 0 || tempNodeList.size() == 0){
            return;
        }
        levelCycle(tempNodeList, rs);
    }

    /**
     * BFS  类似于上面我的解法
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder1(TreeNode root) {
        //边界条件判断
        if (root == null) {
            return new ArrayList<>();
        }
        //队列
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        //根节点入队
        queue.add(root);
        //如果队列不为空就继续循环
        while (!queue.isEmpty()) {
            //BFS打印，levelNum表示的是每层的结点数
            int levelNum = queue.size();
            //subList存储的是每层的结点值
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < levelNum; i++) {
                //出队
                TreeNode node = queue.poll();
                subList.add(node.val);
                //左右子节点如果不为空就加入到队列中
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            //把每层的结点值存储在res中，
            res.add(subList);
        }
        return res;
    }

}
