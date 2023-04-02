package com.menes.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 */
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

class PartitionList {
    public ListNode partition(ListNode head, int x) {
        List<Integer> list = new ArrayList<>();
        int lessThanX = 0;
        while (head != null) {
            if (head.val < x) lessThanX++;
            list.add(head.val);
            head = head.next;
        }
        ListNode nodes = null;

        if (list.size() > 0) {

            List<Integer> less = new ArrayList<>();
            List<Integer> greater = new ArrayList<>();
            for (Integer integer : list) {
                if (integer < x) less.add(integer);
            }
            for (Integer integer : list) {
                if (integer >= x) less.add(integer);
            }
            nodes = new ListNode();
            if (less.size() > 0) {
                addToNode(nodes, less, 0);
            }

        }
        return nodes;
    }

    private void addToNode(ListNode nodes, List<Integer> list, int index) {
        nodes.val = list.get(index++);
        if (index == list.size()) return;
        addToNode((nodes.next = new ListNode()), list, index);
    }
}