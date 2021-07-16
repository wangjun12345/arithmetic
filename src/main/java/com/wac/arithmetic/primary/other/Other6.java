package com.wac.arithmetic.primary.other;

/**
 * @author wj
 * @Description: 计数质数
 * 统计所有小于非负整数n的质数的数量
 * 埃氏筛法:
 * 从2开始遍历到n，将所有2的倍数去除，
 * 从2开始遍历到n，将所有3的倍数去除，
 * 。。。最后剩下的数都是素数
 * @date 2021/7/16 9:09 上午
 */
public class Other6 {

    public static void main(String[] args) {
        int rs = t1(10);
        System.out.println(rs);
    }

    private static int t1(int n) {
        if(n < 3){
            return 0;
        }
        boolean[] nums = new boolean[n];
        int rs = 0;
        for (int i = 2; i < n; i++) {
            if(nums[i]){
                continue;
            }
            rs++;
            for (int j = i; j < n; j+=i) {
                nums[j] = true;
            }
        }
        return rs;
    }
}
