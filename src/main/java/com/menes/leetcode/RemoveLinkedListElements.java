package com.menes.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        List<Integer> list = new ArrayList<>();
        while(head != null){
            if(head.val != val)
                list.add(head.val);
            head = head.next;
        }
        System.out.println(list);
        ListNode nodes = null;
        if(list.size()==0) return nodes;
        nodes = new ListNode();
        addToNode(nodes,list,0);
        return nodes;
    }
    private void addToNode(ListNode nodes,List<Integer> list, int index){
        nodes.val = list.get(index++);
        if(index == list.size()) return;
        addToNode((nodes.next = new ListNode()),list,index);
    }
}
