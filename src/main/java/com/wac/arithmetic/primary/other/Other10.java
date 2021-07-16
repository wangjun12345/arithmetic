package com.wac.arithmetic.primary.other;

/**
 * @author wj
 * @Description: 缺失数字
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数
 * @date 2021/7/16 1:18 下午
 */
public class Other10 {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int rs = t1(nums);
        System.out.println(rs);
    }

    private static int t1(int[] nums) {
        int n = nums.length;
        boolean[] newNums = new boolean[n + 1];
        for (int num : nums) {
            newNums[num] = true;
        }
        for (int i = 0; i < newNums.length; i++) {
            if(!newNums[i]){
                return i;
            }
        }
        return 0;
    }
}
