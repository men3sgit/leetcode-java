package com.menes.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        addToList(list,head);
        Collections.sort(list);
        System.out.println(list);
        addToListNode(list,0,head);
        return head;
    }
    private void addToList(List<Integer> list , ListNode head){
        try{
            list.add(head.val);
            addToList(list,head.next);
        }catch(NullPointerException e){
            return;
        }

    }
    private void addToListNode(List<Integer> list,int index, ListNode head){
        try{
            if(index == list.size()) return;
            head.val = list.get(index);
            addToListNode(list,++index,head.next);
        }catch(NullPointerException e){
            return;
        }
    }
}
