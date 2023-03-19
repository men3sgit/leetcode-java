package com.menes.leetcode;

import java.util.*;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int j : nums1) list.add(j);
        for (int j : nums2) list.add(j);
        Collections.sort(list);
        if (list.size() % 2 == 0)
            return (list.get((list.size() / 2) - 1) + list.get(list.size() / 2)) / 2.0;
        return list.get(list.size() / 2);
    }
}
