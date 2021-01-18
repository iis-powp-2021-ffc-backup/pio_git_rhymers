package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int i;
    public final static int MAX_SIZE = 50;
    private final static int IS_EMPTY = -1;
    private int nodeCounter = 0;

    public void push(int i) {
        nodeCounter++;
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return MAX_SIZE == nodeCounter;
    }
//42 633 02 52
    public int top() {
        if (isEmpty())
            return IS_EMPTY;
        return last.getValue();
    }

    public int pop() {
        nodeCounter--;
        if (isEmpty())
            return IS_EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    private static class Node {

        private final int value;
        private Node prev;
        private Node next;

        protected Node(int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
