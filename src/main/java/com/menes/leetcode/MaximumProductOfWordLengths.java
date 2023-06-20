package com.menes.leetcode;

public class MaximumProductOfWordLengths {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] bitValues = new int[n];
        for (int i = 0; i < n; i++) {
            String word = words[i];
            int value = 0;
            for (int j = 0; j < word.length(); j++) {
                value |= 1 << (word.charAt(j) - 'a');
            }
            bitValues[i] = value;
        }
        int maxProduct = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((bitValues[i] & bitValues[j]) == 0) {
                    maxProduct = Math.max(maxProduct, words[i].length() * words[j].length());
                }
            }
        }
        return maxProduct;
    }
}
