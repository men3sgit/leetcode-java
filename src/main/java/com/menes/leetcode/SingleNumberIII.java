package com.menes.leetcode;
import java.util.*;
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            for(int j =0 ;j<nums.length;j++){
                if(i == j) continue;
                if(nums[i] == nums[j])
                    count++;
            }
            if(count == 0)
                list.add(nums[i]);
        }
        System.out.println(list);
        int [] array = new int[list.size()];
        for(int i = 0;i<array.length;i++){
            array[i] = list.get(i);        }
        return array;
    }
}
