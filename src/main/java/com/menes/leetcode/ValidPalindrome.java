package com.menes.leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        for(char c : s.toLowerCase().toCharArray())
            if(Character.isLetterOrDigit(c)) result.append(c);
        return result.toString().equals(result.reverse().toString());
    }
}
