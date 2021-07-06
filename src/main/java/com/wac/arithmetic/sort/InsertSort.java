package com.wac.arithmetic.sort;

import java.util.Arrays;

/**
 * @author wj
 * @Description: 插入排序  就像是打牌，一张一张的摸牌
 * 每步将一个待排序的纪录，按其关键码值的大小插入前面已经排序的文件中适当位置上，直到全部插入完为止
 * @date 2021/7/5 1:04 下午
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] num = {9,8,7,6,5,1,2,3,4};
//        int[] num = {9,8,7,6,5,4,3,2,1};
        t1(num);
        System.out.println("rs : " + Arrays.toString(num));

    }

    private static void t1(int[] num) {
        int temp;
        for (int i = 1; i < num.length; i++) {
            temp = num[i];
            int j = i;
            while(j  > 0 && num[j - 1] > temp){
                num[j] = num[j - 1];
                j--;
            }
            num[j] = temp;
            System.out.println(i + " : " + Arrays.toString(num));
        }
    }
}
