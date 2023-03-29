package com.menes.leetcode;

import java.math.BigInteger;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        StringBuilder number = new StringBuilder();
        for (int i : digits) {
            number.append(i);
        }
        BigInteger big = new BigInteger(number.toString());
        big = big.add(new BigInteger("1"));
        String value = big.toString();
        int[] array = new int[value.length()];
        for (int i = 0; i < array.length; i++) {
            array[array.length - 1 - i] = Integer.parseInt("" + value.charAt(value.length() - 1 - i));
        }
        return array;
    }
}
