package com.menes.leetcode;
import java.util.*;
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> q = new ArrayDeque<>();

        int left = 0, right = 0;

        while (right < nums.length) {
            if (q.isEmpty()) q.add(nums[right]);
            else {
                while (!q.isEmpty() && nums[right] > q.peekLast()) {
                    q.pollLast();
                }
                q.add(nums[right]);
            }

            if (right - left + 1 == k) {
                ans[left] = q.peek();
                if (nums[left] == q.peek()) q.pollFirst();
                left++;
            }

            right++;
        }

        return ans;

    }
}
