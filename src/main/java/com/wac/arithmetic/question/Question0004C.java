package com.wac.arithmetic.question;

/**
 * @author wj
 * @Description: 寻找两个正序数组的中位数
 * @date 2021/7/19 12:48 下午
 */
public class Question0004C {
    public static void main(String[] args) {
        int[] num1 = {1,3,5,7,9};
        int[] num2 = {2,4,6,8,10};
        double rs = t1(num1, num2);
        System.out.println(rs);
    }

    /**
     * 归并排序后取新数组的中位数
     */
    private static double t1(int[] nums1, int[] nums2) {
        int mergeLen = nums1.length + nums2.length;
        int[] mergeNum = new int[mergeLen];
        int num1Index = 0;
        int num2Index = 0;
        int mergeIndex = 0;
        while(num1Index < nums1.length && num2Index < nums2.length){
            if(nums1[num1Index] < nums2[num2Index]){
                mergeNum[mergeIndex++] = nums1[num1Index++];
            }else{
                mergeNum[mergeIndex++] = nums2[num2Index++];
            }
        }
        while(num1Index < nums1.length){
            mergeNum[mergeIndex++] = nums1[num1Index++];
        }
        while(num2Index < nums2.length){
            mergeNum[mergeIndex++] = nums2[num2Index++];
        }
        if(mergeLen % 2 == 0){
            return ((double)mergeNum[mergeLen / 2] + (double)mergeNum[mergeLen / 2 - 1]) / 2;
        }else{
            return mergeNum[mergeLen / 2];
        }
    }
}
