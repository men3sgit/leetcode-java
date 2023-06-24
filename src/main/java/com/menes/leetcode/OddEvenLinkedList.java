package com.menes.leetcode;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        List<Integer> temp = new ArrayList<>();

        for(int i = 0;i<list.size();i+=2)
            temp.add(list.get(i));
        for(int i = 1;i<list.size();i+=2)
            temp.add(list.get(i));
        int i = 0;

        if(temp.size()>0){
            head = new ListNode();
            addToNode(head,temp,0);
        }
        return head;
    }
    private void addToNode(ListNode head, List<Integer> list, int index){
        head.val = list.get(index++);
        if(index == list.size()) return;
        addToNode((head.next = new ListNode()),list,index);
    }
}
