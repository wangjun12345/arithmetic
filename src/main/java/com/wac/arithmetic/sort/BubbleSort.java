package com.wac.arithmetic.sort;

import java.util.Arrays;

/**
 * @author wj
 * @Description: 冒泡排序
 * 持续比较相邻的元素。如果第一个比第二个大，就交换他们两个。直到没有任何一对数字需要比较
 * @date 2021/7/5 12:45 下午
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] num = {9,8,7,6,5,1,2,3,4};
//        int[] num = {9,8,7,6,5,4,3,2,1};
        t1(num);
        System.out.println("rs : " + Arrays.toString(num));

    }

    private static void t1(int[] num) {
        int temp;
        for (int i = 0; i < num.length; i++) {
            //如果在某次遍历中没有交换元素，则说明已经是有序
            boolean switchFlag = false;
            for (int j = 0; j < num.length - i - 1; j++) {
                if(num[j] > num[j + 1]){
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    switchFlag = true;
                }
            }
            System.out.println(i + " ： " + Arrays.toString(num));
            if(!switchFlag){
                return;
            }
        }

    }
}
