package com.menes.leetcode;
import java.util.Arrays;
public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int element = nums[0];
        for(int i = 1; i<nums.length;i++){
            if(element == nums[i]) return element;
            element = nums[i];
        }
        return element;
    }
}
