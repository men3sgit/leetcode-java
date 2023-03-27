package com.menes.leetcode;

public class ValidNumber {
    public boolean isNumber(String s) {
        if(s.contains("Infinity")||s.endsWith("f")||s.endsWith("D")) return false;
        try{
            Double d = Double.parseDouble(s);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
