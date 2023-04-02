package com.menes.leetcode;

import java.util.ArrayList;
import java.util.List;


public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode nodes = null;
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        if(list.size() == 0) return null;
        nodes  = new ListNode();
        List<Integer> reverseList = new ArrayList<>();
        for(int i = 0;i<left-1;i++){
            reverseList.add(list.get(i));
        }
        System.out.println(reverseList);
        for(int i = right-1;i>=left-1;i--)
            reverseList.add(list.get(i));
        System.out.println(reverseList);

        for(int i = right;i<list.size();i++)
            reverseList.add(list.get(i));
        System.out.println(reverseList);
        addToNode(nodes,reverseList,0);

        return nodes;
    }
    private void addToNode(ListNode nodes, List<Integer> list, int index){
        nodes.val = list.get(index++);
        if(index == list.size()) return;
        nodes.next = new ListNode();
        addToNode(nodes.next,list,index);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
