package com.menes.leetcode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] split = s.trim().split("\\s+");
        return split[split.length -1].length();
    }
}
