package com.menes.leetcode;

public class TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] + numbers[i + 1] == target) {
                res[0] = i + 1;
                res[1] = i + 2;
                return res;
            }
            if (numbers[i] + numbers[i + 1] < target) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] + numbers[j] == target) {
                        res[0] = i + 1;
                        res[1] = j + 1;
                        return res;
                    }
                }
            }
        }

        return res;
    }
}
