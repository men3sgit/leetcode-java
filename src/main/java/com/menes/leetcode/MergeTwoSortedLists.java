package com.menes.leetcode;

import com.menes.leetcode.service.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode nodes = new ListNode();
        List<Integer> list = new ArrayList<>();
        addToList(list, list1);
        addToList(list, list2);
        Collections.sort(list);
        System.out.println(list);
        if (list.size() > 0) {
            setNode(nodes, 0, list);
        } else {
            return null;
        }

        return nodes;
    }

    private void addToList(List<Integer> list, ListNode nodeList) {
        if (nodeList == null) return;
        else {
            list.add(nodeList.val);
            addToList(list, nodeList.next);
        }
    }

    private void setNode(ListNode nodes, int index, List<Integer> list) {
        if (index < list.size() - 1) {
            nodes.val = list.get(index);
            System.out.println(nodes.val);
            nodes.next = new ListNode();
            setNode(nodes.next, ++index, list);
        } else if (index == list.size() - 1) {
            nodes.val = list.get(index);
        }
        return;
    }
}
