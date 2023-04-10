package com.menes.leetcode;

import java.util.StringTokenizer;

public class ReverseWordInString {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder res = new StringBuilder();
        StringTokenizer token = new StringTokenizer(s);
        while(token.hasMoreTokens()){
            res.insert(0, token.nextToken() + " ");
        }
        return res.toString().trim();

    }
}
