package com.wac.arithmetic.question;

import java.util.List;

/**
 * @author wj
 * @Description: 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组
 * 注意：答案中不可以包含重复的三元组
 * @date 2021/7/23 9:16 上午
 */

public class Question0015B {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,3,-1,-4};
        List<List<Integer>> rs = t1(nums);
        System.out.println(rs);
    }

    private static List<List<Integer>> t1(int[] nums) {
    }
}
