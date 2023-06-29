package com.kongboxuan.candycrushletter;

import java.util.ArrayList;

/**
 * Custom stack data structure
 */
public class Stack {
    // Simulate stack structure using array queues
    private final ArrayList<Character> stack;
    // Application of Strategy pattern: By defining different policies,
    // the refresh operation of Stack will have different effects.
    private final RefreshStrategy strategy;

    public Stack() {
        this(new RemoveCharactersStrategy());
    }

    public Stack(RefreshStrategy strategy) {
        stack = new ArrayList<>();
        this.strategy = strategy;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Stacking operation:
     * 1. When the stack is empty, directly push it onto the stack;
     * 2. When the stack pressing element is the same as the top element,
     * directly push it onto the stack;
     * 3. When the stack pressing element is different from the top element,
     * refresh the stack first, and then push the element into the stack.
     *
     * @param c the stack pressing element
     * @return Is there a refresh stack during the stack pressing process
     */
    public boolean push(char c) {
        if (isEmpty()) {
            stack.add(c);
            return false;
        }

        char topElement = peek();
        if (topElement == c) {
            stack.add(c);
            return false;
        }

        boolean ret = refresh();
        stack.add(c);

        return ret;
    }

    /**
     * Get the top element of the stack
     *
     * @return the top element of the stack
     */
    public char peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is empty.");
        }

        int top = stack.size() - 1;
        return stack.get(top);
    }

    /**
     * Refresh stack through different strategies
     *
     * @return Is there a refresh stack during the stack pressing process
     */
    public boolean refresh() {
        return strategy.refresh(stack);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        stack.forEach(sb::append);

        return sb.toString();
    }
}
