package com.wac.arithmetic.primary.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wj
 * @Description: 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * @date 2021/5/13 2:11 下午
 */
public class Array1 {

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,4,4,5};
        System.out.println(t1(nums));
    }

    private static int t1(int[] nums) {
        //边界条件判断
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        for (int right = 1; right < nums.length; right++){
            if (nums[left] != nums[right]) {
                nums[++left] = nums[right];
            }
        }
        return ++left;
    }

}
