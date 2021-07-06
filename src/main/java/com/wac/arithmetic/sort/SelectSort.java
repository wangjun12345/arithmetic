package com.wac.arithmetic.sort;

import java.util.Arrays;

/**
 * @author wj
 * @Description: 选择排序  打牌时没排序抓到一堆牌，每次找出最小（最大）的牌往一边放
 * 每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完
 *
 * @date 2021/7/6 9:51 上午
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] num = {9,8,7,6,5,1,2,3,4};
//        int[] num = {9,8,7,6,5,4,3,2,1};
        t1(num);
        System.out.println("rs : " + Arrays.toString(num));
    }

    private static void t1(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < num.length; j++) {
                if(num[j] < num[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex > i){
                int temp = num[minIndex];
                num[minIndex] = num[i];
                num[i] = temp;
            }
            System.out.println(i + 1 + " : " + Arrays.toString(num));
        }

    }
}
