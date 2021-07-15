package com.wac.arithmetic.primary.other;

/**
 * @author wj
 * @Description: 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * @date 2021/7/9 10:51 上午
 */
public class Other3 {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int rs = maxSubArray(nums);
        int rs = maxSubArray2(nums);
        System.out.println(rs);
    }

    /**
     * 动态规划
     * 数组dp[i]表示前i + 1个元素构成的最大连续子数组之和（这个值一定加上了nums【i】，为了能够取到连续的子数组，所以不够准确）
     * dp[i+1] = nums[i] + max(dp[i], 0)
     *
     * 可以再优化：dp[]数组只是为了取最大值，用一个int变量代替数组即可
     */
    private static int maxSubArray2(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + Math.max(dp[i - 1], 0);
            if(max < dp[i]){
                max = dp[i];
            }
        }
        return max;
    }

    //遍历取值
    private static int maxSubArray(int[] nums) {
        int[] maxNums = new int[nums.length];
        for (int i = 1; i <= nums.length; i++) {
            int tempIndex = 0;
            int[] tempMaxNum = new int[nums.length - i + 1];
            while(tempIndex + i - 1 < nums.length){
                int tempSum = 0;
                for (int j = tempIndex; j < i + tempIndex; j++) {
                    tempSum += nums[j];
                }
                tempMaxNum[tempIndex] = tempSum;
                tempIndex++;
            }
            int maxNumChild = tempMaxNum[0];
            for (int k = 1; k < tempMaxNum.length; k++) {
                if(maxNumChild < tempMaxNum[k]){
                    maxNumChild = tempMaxNum[k];
                }
            }
            maxNums[i - 1] = maxNumChild;
        }
        int maxNum = maxNums[0];
        for (int i = 0; i < maxNums.length; i++) {
            if(maxNum < maxNums[i]){
                maxNum = maxNums[i];
            }
        }
        return maxNum;
    }
}
