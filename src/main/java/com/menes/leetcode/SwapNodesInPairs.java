package com.menes.leetcode;

import com.menes.leetcode.service.ListNode;

import java.util.ArrayList;
import java.util.List;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode nodes = null;
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        if(list.size() == 1){
            nodes = new ListNode();
            nodes.val = list.get(0);
        }
        if(list.size()>1){
            nodes = new ListNode();
            mixList(list);
            System.out.println(list);
            addToNode(nodes,list,0);
        }
        return nodes;
    }
    private void addToNode(ListNode nodes, List<Integer> list, int index){
        nodes.val = list.get(index++);
        if(index == list.size()) return;
        addToNode((nodes.next = new ListNode()),list,index);
    }
    private void mixList(List<Integer> list){
        int length = list.size()%2 == 0 ? list.size() : list.size()-1;
        for(int i = 0;i<length;i+=2){
            int temp = list.get(i);
            list.set(i,list.get(i+1));
            list.set(i+1,temp);
        }
    }
}
