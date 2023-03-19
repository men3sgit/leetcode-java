package com.menes.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        return String.valueOf(x).equals(new StringBuffer(x + "").reverse().toString());
    }
}
