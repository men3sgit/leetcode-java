package com.menes.leetcode;

import java.util.*;
public class ReverseLinkedList  {
    public ListNode reverseList(ListNode head) {
        ListNode nodes = new ListNode();
        List<Integer> list = new ArrayList<>();
        addToList(head,list);
        if(list.isEmpty()) return null;
        Collections.reverse(list);
        addToNode(nodes,list,0);

        return nodes;
    }
    private void addToList(ListNode head, List<Integer> list){
        try{
            list.add(head.val);
            addToList(head.next,list);
        }catch(NullPointerException e){
            return;
        }
    }
    private void addToNode(ListNode nodes, List<Integer> list, int index){
        nodes.val = list.get(index++);
        if(index == list.size()) return;

        addToNode((nodes.next = new ListNode()),list,index);
    }
}
