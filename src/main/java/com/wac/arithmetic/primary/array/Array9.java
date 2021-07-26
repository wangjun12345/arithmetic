package com.wac.arithmetic.primary.array;

import java.util.*;

/**
 * @author wj
 * @Description: 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * @date 2021/6/18 11:02 上午
 */
public class Array9 {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(t2(nums, target)));
    }

    private static int[] t1(int[] nums, int target) {
        int[] rs = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if(nums[i] + nums[i1] == target){
                    rs[0] = i;
                    rs[1] = i1;
                    break;
                }
            }
        }
        return rs;
    }

    private static int[] t2(int[] nums, int target) {
        int[] rs = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                rs[0] = i;
                rs[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return rs;
    }
}
