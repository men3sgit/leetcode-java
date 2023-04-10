package com.menes.leetcode;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if(nums.length == 2) return nums[0] > nums[1] ? 0 : 1;
        if(nums.length == 1) return 0;

        for(int i = 1;i<nums.length -1;i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) return i;
        }

        return nums[0] > nums[nums.length-1] ? 0 : nums.length-1;
    }
}
