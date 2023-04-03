package com.menes.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0;j<i+1;j++){
                if(i == 0){
                    row.add(1);continue;
                }
                if(j == 0 || j==i){
                    row.add(1);
                }
                else{
                    row.add(list.get(i-1).get(j-1) +list.get(i-1).get(j));
                }
            }
            list.add(row);
        }
        return list;
    }
}
