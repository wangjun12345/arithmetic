package com.wac.arithmetic.primary.array;

import java.util.*;

/**
 * @author wj
 * @Description: 两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 * @date 2021/6/11 9:19 上午
 */
public class Array6 {

    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,4,5};
        int[] num2 = {2,3,4,4,4,6};
        t1(num1, num2);
    }

    private static void t1(int[] num1, int[] num2) {
        int[] rs = new int[Math.max(num1.length, num2.length)];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : num1) {
            Integer cnt = map.get(i);
            if(cnt == null){
                cnt = 0;
            }
            map.put(i, cnt + 1);
        }
        int index = 0;
        for (int i : num2) {
            Integer cnt = map.get(i);
            if(cnt != null && cnt > 0){
                rs[index] = i;
                index ++ ;
                map.put(i, cnt - 1);
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(rs, index)));
    }

    private static void t2(int[] num1, int[] num2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : num1) {
            int cnt = 0;
            for (int i1 : num2) {
                if(i == i1){
                    cnt ++;
                    map.put(i, cnt);
                }
            }
        }
        System.out.println(map);
    }

    private static void t3(int[] num1, int[] num2) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : num1) {
            int cnt = 0;
            for (int i1 : num2) {
                if(i == i1){
                    list.add(i);
                }
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }


}
