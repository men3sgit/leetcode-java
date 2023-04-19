package com.menes.leetcode;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        k%=nums.length;
        int[] array1 = new int[k];
        int[] array2 = new int[nums.length-k];
        System.arraycopy(nums, nums.length - k, array1, 0, k);
        if (nums.length - k >= 0) System.arraycopy(nums, 0, array2, 0, nums.length - k);
        System.arraycopy(array1, 0, nums, 0, array1.length);
        System.arraycopy(array2, 0, nums, array1.length, array2.length);
    }
}
