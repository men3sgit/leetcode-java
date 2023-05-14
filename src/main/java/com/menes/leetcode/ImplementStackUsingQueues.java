package com.menes.leetcode;
import java.util.*;
public class ImplementStackUsingQueues {
    private Queue<Integer> queue = new LinkedList<>();

    public ImplementStackUsingQueues() {
    }

    public void push(int x) {

        queue.add(x);
        for (int i = 1; i < queue.size(); i++)
            queue.add(queue.remove());
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

