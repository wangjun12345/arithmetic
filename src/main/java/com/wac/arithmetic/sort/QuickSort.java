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
        int[] num = {6,8,7,9,5,1,2,3,4};
//        int[] num = {9,8,7,6,5,4,3,2,1};
        t1(num, 0, num.length - 1);
        System.out.println("rs : " + Arrays.toString(num));
    }


    private static void t1(int[] num, int low, int high) {
        if(low > high){
            return;
        }
        //交换左右值
        int i = swap(num, low, high);
        System.out.println(Arrays.toString(num));

        //递归左边
        t1(num, low, i - 1);
        //递归右边
        t1(num, i + 1, high);
    }

    /**
     * 返回要与基准值交换的索引
     */
    private static int swap(int[] num, int low, int high) {
        //基准值
        int pivot = num[low];
        int i = low;
        int j = high;
        while(i < j){
            //先看右边 这样最后i和j相等时，是通过j--得到的，这样最后与基准值交换的一定是小于基准值的
            while(pivot <= num[j] && i < j){
                j--;
            }
            //再看左边
            while(pivot >= num[i] && i < j ){
                i++;
            }
            if(i < j){
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
        num[low] = num[i];
        num[i] = pivot;
        return i;
    }

}
