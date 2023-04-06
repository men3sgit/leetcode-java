package com.menes.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReorderList {
    public void reorderList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        addToList(head,list);
        if(list.isEmpty()) return;
        System.out.println(list);
        int i = 0;
        while(head!=null){
            if(i%2==0)
                head.val = list.get(i/2);
            else
                head.val = list.get(list.size()-i/2-1);
            head = head.next;
            i++;
        }


    }
    private void addToList(ListNode head, List<Integer> list){
        try{
            list.add(head.val);
            addToList(head.next,list);
        }catch(NullPointerException e){
            return;
        }
    }
}
