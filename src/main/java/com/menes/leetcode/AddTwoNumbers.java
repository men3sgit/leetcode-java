package com.menes.leetcode;

import java.math.BigInteger;

// Definition for singly-linked list.
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
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger sum;
        StringBuilder formatNumber = new StringBuilder();
        getValueSum(l1, formatNumber);
        sum = new BigInteger(formatNumber.toString());
        formatNumber.delete(0, formatNumber.length());
        getValueSum(l2, formatNumber);
        sum = sum.add(new BigInteger(formatNumber.toString()));
        formatNumber = new StringBuilder(sum.toString());
        ListNode head = new ListNode();
        setValueListNode(head, formatNumber, 0);

        return head;
    }

    private void getValueSum(ListNode l, StringBuilder formatNumber) {
        try {
            formatNumber.insert(0, l.val);
            getValueSum(l.next, formatNumber);
        } catch (NullPointerException e) {
            return;
        }
    }

    private void setValueListNode(ListNode head, StringBuilder formatNumber, int i) {
        head.val = Character.getNumericValue(formatNumber.charAt(formatNumber.length() - i - 1));
        i++;
        if (i == formatNumber.length()) return;
        head.next = new ListNode();
        setValueListNode(head.next, formatNumber, i);
    }
}