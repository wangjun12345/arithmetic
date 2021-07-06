package com.wac.arithmetic.primary.array;

import java.util.Arrays;

/**
 * @author wj
 * @Description: 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * @date 2021/6/18 9:43 上午
 */
public class Array8 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,0,3};
        t1(arr);
    }

    private static void t1(int[] nums) {
        int switchIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                int temp = nums[switchIndex];
                nums[switchIndex] = nums[i];
                nums[i] = temp;
                switchIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
