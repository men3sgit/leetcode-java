package com.menes.leetcode;

import com.menes.leetcode.service.ListNode;

import java.util.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<Integer> list = new ArrayList<>();
        ListNode nodes = null;

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        if (list.size() == 1 && n == 1) return nodes;

        else
            list.remove((list.size() - n));

        nodes = new ListNode();
        addToNode(nodes, list, 0);

        return nodes;
    }

    private void addToNode(ListNode nodes, List<Integer> list, int index) {
        nodes.val = list.get(index++);
        if (index == list.size())
            return;
        addToNode((nodes.next = new ListNode()), list, index);
    }
}


