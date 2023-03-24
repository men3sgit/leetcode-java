package com.menes.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums)
            list.add(i);
        int index = -1;
        if(list.contains(target)){
            index = list.indexOf(target);
        }
        return index;
    }
}
