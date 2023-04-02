package com.menes.leetcode;

import java.util.Arrays;

public class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, nums1.length - nums2.length, nums2.length);
        Arrays.sort(nums1);
    }
}
