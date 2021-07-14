package com.wac.arithmetic.sort;

import java.util.Arrays;

/**
 * @author wj
 * @Description: 归并排序   把队列分成一个个很小的队列（1-2个元素），分别排序后再进行归并
 * 快排是先排大的序列，再慢慢排小队列，而归并是先从小的开始，再排大的
 * @date 2021/7/7 7:52 上午
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] num = {6,8,7,9,5,1,2,3,4};
//        int[] num = {9,8,7,6,5,4,3,2,1};
        t1(num, 0, num.length - 1);
        System.out.println("rs : " + Arrays.toString(num));
    }

    private static void t1(int[] num, int low, int high) {
        if(low >= high){
            return;
        }
        int mid = (low + high)/2;
        //排左子序列
        t1(num, low, mid);
        //排右子序列
        t1(num, mid + 1, high);
        //归并
        merge(num, low, mid, high);
        System.out.println(Arrays.toString(num));
    }

    private static void merge(int[] num, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;
        //先把较小的数移动temp中
        while(left <= mid && right <= high){
            if(num[left] < num[right]){
                temp[k++] = num[left++];
            }else{
                temp[k++] = num[right++];
            }
        }
        //移动剩余的数据，要么只剩下左边，要不只剩下右边
        while(left <= mid){
            temp[k++] = num[left++];
        }
        while(right <= high){
            temp[k++] = num[right++];
        }
        for (int i = 0; i < temp.length; i++) {
            num[low + i] = temp[i];
        }
    }
}
