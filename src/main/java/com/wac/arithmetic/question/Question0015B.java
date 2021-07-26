package com.wac.arithmetic.question;

import java.util.ArrayList;
import java.util.Arrays;
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

    /**
     * 解题思路：
     * 双指针法铺垫： 先将给定 nums 排序，复杂度为 O(NlogN)O(NlogN)。
     * 双指针法思路： 固定3个指针中最左（最小）数字的指针 k，双指针 i，j 分设在数组索引 (k, len(nums))(k,len(nums)) 两端，通过双指针交替向中间移动，记录对于每个固定指针 k 的所有满足 nums[k] + nums[i] + nums[j] == 0 的 i,j 组合：
     * 当 nums[k] > 0 时直接break跳出：因为 nums[j] >= nums[i] >= nums[k] > 0，即 33 个数字都大于 00 ，在此固定指针 k 之后不可能再找到结果了。
     * 当 k > 0且nums[k] == nums[k - 1]时即跳过此元素nums[k]：因为已经将 nums[k - 1] 的所有组合加入到结果中，本次双指针搜索只会得到重复组合。
     * i，j 分设在数组索引 (k, len(nums))(k,len(nums)) 两端，当i < j时循环计算s = nums[k] + nums[i] + nums[j]，并按照以下规则执行双指针移动：
     * 当s < 0时，i += 1并跳过所有重复的nums[i]；
     * 当s > 0时，j -= 1并跳过所有重复的nums[j]；
     * 当s == 0时，记录组合[k, i, j]至res，执行i += 1和j -= 1并跳过所有重复的nums[i]和nums[j]，防止记录到重复组合。
     */
    private static List<List<Integer>> t1(int[] nums) {
        if (nums.length < 3){
            return new ArrayList<>();
        }
        List<List<Integer>> rs = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] > 0){
                break;
            }
            if (k > 0 && nums[k] == nums[k - 1]){
                continue;
            }
            int left = k + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[k] + nums[left] + nums[right];
                if (sum < 0){
                    //空while循环，用于消除重复集合
                    while (left < right && nums[left] == nums[++left]);
                } else if(sum > 0){
                    while (left < right && nums[right] == nums[--right]);
                } else {
                    rs.add(Arrays.asList(nums[k], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[++left]);
                    while (left < right && nums[right] == nums[--right]);
                }
            }
        }
        return rs;
    }
}
