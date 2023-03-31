package com.menes.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums)
            list.add(i);

        for (int i = 0; i < list.size(); i++)
            remove(list, i);
        for (int i = 0; i < list.size(); i++)
            nums[i] = list.get(i);

        return list.size();
    }

    private void remove(List<Integer> list, int index) {
        int count = 0;
        int root = list.get(index);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) == root) {
                count++;
                if (count > 2)
                    list.remove(i);
            }
            i++;
        }

    }


}
