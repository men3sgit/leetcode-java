package com.menes.leetcode;

import com.menes.leetcode.service.ListNode;

import java.util.ArrayList;
import java.util.List;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode nodes = null;
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        int size = list.size();
        if(size ==0) return null;
        k %=size;
        List<Integer> rotateList = new ArrayList<>();
        for(int i = size - k;i<size;i++)
            rotateList.add(list.get(i));

        for(int i = 0;i<size-k;i++)
            rotateList.add(list.get(i));

        nodes = new ListNode();
        addToNode(nodes,rotateList,0);


        return nodes;
    }
    private void addToNode(ListNode nodes, List<Integer>list, int index){
        nodes.val = list.get(index++);
        if(index==list.size()) return;
        addToNode((nodes.next = new ListNode()),list,index);
    }
}
