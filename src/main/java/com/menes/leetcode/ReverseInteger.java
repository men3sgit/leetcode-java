package com.menes.leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        char operator = ' ';
        if (x < 0) {
            operator = '-';
            x *= -1;
        }
        StringBuilder builder = new StringBuilder("" + x);
        try {
            return Integer.parseInt((operator + builder.reverse().toString()).trim());
        } catch (Exception e) {
            return 0;

        }
    }
}
