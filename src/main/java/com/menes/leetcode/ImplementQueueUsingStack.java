package com.menes.leetcode;
import java.util.*;
public class ImplementQueueUsingStack {
    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        if(empty()) return 0;
        return queue.poll();
    }

    public int peek() {
        if(empty()) return 0;
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
