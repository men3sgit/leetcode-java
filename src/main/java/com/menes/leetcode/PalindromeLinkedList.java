package com.menes.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head !=null){
            list.add(head.val);
            head = head.next;
        }
        for(int i = 0;i<list.size()/2;i++){
            if(!Objects.equals(list.get(i), list.get(list.size() - 1 - i))) return false;
        }
        return true;
    }
}
