package edu.kis.vh.nursery.Collections;

public class IntArrayStackAdapter implements Collection {

    private final IntArrayStack intArrayStack;

    public IntArrayStackAdapter(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    @Override
    public void push(int i) {
        intArrayStack.countIn(i);
    }

    @Override
    public boolean isEmpty() {
        return intArrayStack.callCheck();
    }

    @Override
    public boolean isFull() {
        return intArrayStack.isFull();
    }

    @Override
    public int top() {
        return intArrayStack.peekaboo();
    }

    @Override
    public int size() {
        return intArrayStack.getTotal();
    }

    @Override
    public int pop() {
        return intArrayStack.countOut();
    }
}
