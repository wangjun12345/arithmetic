package com.wac.arithmetic.sort;

import java.util.Arrays;

/**
 * @author wj
 * @Description: 快速排序
 * 将数组分区，最小下标a,最大下标b，选择a-b间一个下标c，将大于num[c]的放到c-b之间，小于num[c]的放到a-c之间，这样c的前后就有序了，同理再将区间细分，移动
 * @date 2021/7/6 10:15 上午
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] num = {9,8,7,6,5,1,2,3,4};
//        int[] num = {9,8,7,6,5,4,3,2,1};
        t1(num);
        System.out.println("rs : " + Arrays.toString(num));
    }

    private static void t1(int[] num) {
    }
}
