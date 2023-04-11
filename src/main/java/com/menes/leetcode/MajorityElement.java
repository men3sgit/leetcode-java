package com.menes.leetcode;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int num = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == num) {
                count++;
                System.out.println(num);
            }
            if (count > nums.length / 2) break;
            else if (nums[i] != num) {
                count = 1;
                num = nums[i];
            }
        }
        return num;
    }
}
