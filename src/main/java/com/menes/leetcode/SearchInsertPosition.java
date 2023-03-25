package com.menes.leetcode;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        if(nums[nums.length-1] < target) return nums.length;
        for(int i= 0 ;i<nums.length;i++){
            if(nums[i] < target)continue;
            else{
                index = i;break;
            }
        }
        return index;
    }
}
