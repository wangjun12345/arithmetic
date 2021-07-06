package com.wac.arithmetic.primary.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wj
 * @Description: 两个非空的数组，将他们逆序后组成的两个数字相加，得到的数字以相同的方式返回一个新的数组，每个节点只能存一位正整数
 * @date 2021/5/15 10:54 上午
 */
public class Array2 {

    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,0,0,0,1};
        StringBuilder str1 = new StringBuilder();
        for (int i = a1.length-1; i >= 0; i--) {
            str1.append(a1[i]);
        }
        StringBuilder str2 = new StringBuilder();
        for (int i = a2.length-1; i >= 0; i--) {
            str2.append(a2[i]);
        }
        String rsStr = (Integer.parseInt(str1.toString()) + Integer.parseInt(str2.toString())) + "";
        List<Integer> list =  new ArrayList<Integer>(rsStr.length());
        for(int i = rsStr.length()-1; i >= 0; i--){
            list.add(Integer.parseInt(String.valueOf(rsStr.charAt(i))));
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}
