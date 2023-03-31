package com.menes.leetcode;

import com.menes.leetcode.service.ListNode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode nodes = null;
        while(head !=null){
            if(!list.contains(head.val))
                list.add(head.val);
            head = head.next;
        }
        if(list.size()>0){
            nodes = new ListNode();
            addToNode(nodes,list,0);
        }
        return nodes;
    }
    private void addToNode(ListNode nodes, List<Integer> list, int index){
        nodes.val = list.get(index++);
        if(index == list.size()) return;
        addToNode((nodes.next = new ListNode()),list,index);
    }
}
