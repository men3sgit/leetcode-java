package com.menes.leetcode;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i : nums)
            if(i !=0)
                list.add(i);

        for(int i = 0 ;i<list.size();i++)
            nums[i] = list.get(i);

        for(int i = list.size();i<nums.length;i++)
            nums[i] = 0;

    }
}
