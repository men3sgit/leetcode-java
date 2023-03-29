package com.menes.leetcode;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            if (ints[ints.length - 1] >= target) {
                for (int anInt : ints) {
                    if (anInt == target) return true;
                }
                return false;
            }
        }
        return false;
    }
}
