package com.menes.leetcode;

import java.util.Arrays;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int a = nums.length;
        return nums[a - k];
    }

}
