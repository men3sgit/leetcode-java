package com.menes.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        int[][] array = new int[rowIndex+1][];
        for(int i = 0;i<rowIndex+1;i++){
            array[i] = new int[i+1];
            for(int j = 0;j<i+1;j++){
                if(j == 0 || j==i) array[i][j] = 1;
                else array[i][j] = array[i-1][j-1] + array[i-1][j];
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        if(rowIndex == 0){
            res.add(1);
            return res;
        }
        for(int i : array[rowIndex]){
            res.add(i);
        }
        return res;

    }
}
