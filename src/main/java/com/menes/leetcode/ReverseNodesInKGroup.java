package com.menes.leetcode;

import com.menes.leetcode.service.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1) return head;
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
            mixList(list,k);
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
    private void mixList(List<Integer> list,int k){
        int length = list.size()%k == 0 ? list.size() : list.size()-(list.size()%k);
        for(int i = 0;i<length;i+=k){
            List<Integer> subList = new ArrayList<>();
            for(int j = 0;j<k;j++){
                subList.add(list.get(i+j));
            }
            Collections.reverse(subList);
            System.out.println(subList);
            for(int j = 0;j<k;j++){
                list.set(i+j,subList.get(j));
            }
        }
    }
}
