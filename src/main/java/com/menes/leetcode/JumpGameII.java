package com.menes.leetcode;

public class JumpGameII {
    public int jump(int[] nums) {

        // The starting range of the first jump is [0, 0]
        int answer = 0, n = nums.length;
        int curr = 0, far = 0;

        for (int i = 0; i < n - 1; ++i) {

            // Update the farthest reachable index of this jump

            //i+nums[i] in this equation we need to find the farthest position can that index go here i represent the index it is already there and nums[i] represent how much we can jump. I hope this help

            far = Math.max(far, i + nums[i]);

            // If we finish the starting range of this jump,
            // Move on to the starting range of the next jump.
            if (i == curr) {
                answer++;
                curr = far;
            }
        }

        return answer;
    }
}
