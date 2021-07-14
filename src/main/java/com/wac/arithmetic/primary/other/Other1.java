package com.wac.arithmetic.primary.other;

import java.util.Arrays;

/**
 * @author wj
 * @Description: 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 *
 * 归并排序解决
 * @date 2021/7/5 9:46 上午
 */
public class Other1 {

    public static void main(String[] args) {
        int[] nums1 =  new int[]{1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        t1(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    private static void t1(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        int[] temp = new int[m + n];
        int left = 0;
        int right = 0;
        while(left <= m - 1 && right <= n - 1){
            if(nums1[left] < nums2[right]){
                temp[k++] = nums1[left++];
            }else{
                temp[k++] = nums2[right++];
            }
        }
        while(left <= m - 1){
            temp[k++] = nums1[left++];
        }
        while(right <= n - 1){
            temp[k++] = nums2[right++];
        }
        for (int i = 0; i < temp.length; i++) {
            nums1[i] = temp[i];
        }
    }

}
