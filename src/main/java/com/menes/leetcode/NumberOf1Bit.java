package com.menes.leetcode;

public class NumberOf1Bit {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String number = String.valueOf(Integer.toBinaryString(n));
        System.out.println(number);
        int count =0;
        for(char c : number.toCharArray())
            if(c == '1'){
                count++;
            }
        return count;
    }
}
