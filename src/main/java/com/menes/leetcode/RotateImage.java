package com.menes.leetcode;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix.length];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
                temp[i][j] = matrix[matrix.length -1 - j][i];
            }
        }
        for(int i = 0;i<temp.length;i++){
            matrix[i] = temp[i].clone();
        }
    }
}
