package com.menes.leetcode;

import com.menes.leetcode.service.ListNode;

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
public class RemoveDuplicatedFromSortedListII {

        public ListNode deleteDuplicates(ListNode head) {
            if(head==null || head.next == null) return head;

            if(head.val!=head.next.val)
            {
                head.next = deleteDuplicates(head.next);
                return head;
            }

            while(head.next!=null && head.val==head.next.val)
            {
                head=head.next;
            }

            return deleteDuplicates(head.next);

    }
}
