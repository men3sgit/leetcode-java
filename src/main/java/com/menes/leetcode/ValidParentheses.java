package com.menes.leetcode;

import java.util.*;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }
            try {
                char pre = stack.peek();
                if ((pre == '(' && c == ')') || (pre == '[' && c == ']') || (pre == '{' && c == '}')) {
                    stack.pop();
                } else stack.push(c);
            } catch (Exception e) {
                return false;
            }


        }
        System.out.println(stack.size());
        return stack.isEmpty();
    }
}
