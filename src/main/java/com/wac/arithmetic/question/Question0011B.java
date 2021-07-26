package com.wac.arithmetic.question;

/**
 * @author wj
 * @Description: 盛最多水的容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水
 *
 * @date 2021/7/22 9:15 上午
 */
public class Question0011B {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int rs = t1(height);
        System.out.println(rs);
    }

    /**
     * 双指针解法：
     * 最开始是left=0,right= len - 1,面积等于(len-1) * Math.min(height[left], height[right])，此时移动指针不能两个一起移动，
     * 因为一起移动会少算一种情况，应该移动left，right所标识的值中较小的那一个，这样做的目的是让后面Math.min(height[left], height[right])这个值更大
     * @param height
     * @return
     */
    private static int t1(int[] height) {
        int rs = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right){
            int tempRs = (right - left) * Math.min(height[left], height[right]);
            rs = Math.max(rs, tempRs);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return rs;
    }
}
