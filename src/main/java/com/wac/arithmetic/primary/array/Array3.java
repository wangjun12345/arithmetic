package com.wac.arithmetic.primary.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wj
 * @Description: 旋转数组
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * @date 2021/5/28 9:29 上午
 */
public class Array3 {

    /**
     * 遍历赋值到一个新数组
     */
    @Test
    public void t0(){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int l = nums.length;
        int[] newNums = new int[l];
        for(int i = 0; i < l; i++){
            newNums[i] = nums[(l +i - k)%l];
        }
        System.out.println(Arrays.toString(newNums));
    }

    /**
     *  三次旋转
     *  1.旋转整个数组
     *  2.旋转0到k个
     *  3.旋转k到最后一个元素
     */
    @Test
    public void t1(){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
    }

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        reverse(nums, 0, length -1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, length - 1);
        System.out.println(Arrays.toString(nums));
    }

    //把数组中从[start，end]之间的元素两两交换,也就是反转
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
