package com.menes.leetcode;

import com.menes.leetcode.service.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        ListNode nodes = null;
        List<Integer> values = new ArrayList<>();
        for(ListNode ls : lists){
            addToList(ls,values);
        }
        System.out.println(values);

        if(values.size() > 0){
            nodes = new ListNode();
            Collections.sort(values);
            addToNode(values,0,nodes);
        }
        return nodes;
    }
    private void addToList(ListNode nodes, List<Integer> list){
        try{
            list.add(nodes.val);
            addToList(nodes.next,list);
            if(nodes.next == null) return;

        }catch(NullPointerException e){
            return;
        }

    }
    private void addToNode(List<Integer> values, int index, ListNode nodes){
        nodes.val = values.get(index);
        index++;
        if(index == values.size()) return;
        nodes.next = new ListNode();
        addToNode(values,index,nodes.next);
    }
}
