package com.wac.arithmetic.primary.array;

import java.util.Arrays;

/**
 * @author wj
 * @Description: 旋转图像
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像
 * @date 2021/6/18 1:41 下午
 */
public class Array10 {
    public static void main(String[] args) {
        int[] matrix1 = {1,2,3,4};
        int[] matrix2 = {5,6,7,8};
        int[] matrix3 = {9,10,11,12};
        int[] matrix4 = {13,14,15,16};
        int[][] matrix = {matrix1, matrix2, matrix3, matrix4};
        t1(matrix);
    }

    private static void reverse(int[][] matrix) {
        for (int i = 0; i < matrix.length/2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[matrix.length - 1 - i];
            matrix[matrix.length - 1 - i] = temp;
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    private static void t1(int[][] matrix) {
        int length = matrix.length;
        reverse(matrix);
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
