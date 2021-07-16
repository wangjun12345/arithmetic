package com.wac.arithmetic.primary.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wj
 * @Description: 杨辉三角
 *
 * @date 2021/7/16 10:37 上午
 */
public class Other8 {
    public static void main(String[] args) {
        List<List<Integer>> rs = t1(5);
        System.out.println(rs);
    }

    private static List<List<Integer>> t1(int numRows) {
        List<List<Integer>> rs = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> cList = new ArrayList<>();
            if(i == 1){
                cList.add(1);
                rs.add(cList);
                continue;
            }
            List<Integer> lastList = rs.get(i - 2);
            for (int j = 0; j < i; j++) {
                if(j == 0 || j == i -1){
                    cList.add(1);
                }else{
                    cList.add(lastList.get(j - 1) + lastList.get(j));
                }
            }
            rs.add(cList);
        }
        return rs;
    }
}
