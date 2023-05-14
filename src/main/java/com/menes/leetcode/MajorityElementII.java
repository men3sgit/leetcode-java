package com.menes.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        int majority = 3;
        int appears = nums.length/majority;
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int element : nums){
            if(map.containsKey(element)){
                map.put(element,map.get(element)+1);
            }
            else
                map.put(element,1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > appears) list.add(entry.getKey());
        }
        return list;

    }
}
