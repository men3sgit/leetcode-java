package com.menes.leetcode;
import java.util.Arrays;
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(i!=nums[i]) return i;
        }
        return nums.length;

    }
}
