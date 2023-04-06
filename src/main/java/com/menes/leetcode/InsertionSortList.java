package com.menes.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        ListNode nodes = null;
        if(list.size()>0){
            nodes = new ListNode();
            Collections.sort(list);
            addToNode(nodes,list,0);
        }
        return nodes;
    }
    private void addToNode(ListNode nodes, List<Integer> list, int index){
        nodes.val = list.get(index);
        if(++index == list.size()) return;
        addToNode((nodes.next = new ListNode()),list,index);
    }
}
