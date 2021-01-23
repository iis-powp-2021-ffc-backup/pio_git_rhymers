package edu.kis.vh.nursery.list;

/**
 * Linked list implementation for holding int value in each node
 */
public class IntLinkedList {

    /**
     * Holds reference to last node in linked list or null if is empty
     */
    private Node last;
    /**
     * Capacity of linked list
     */
    public final static int MAX_SIZE = 50;
    /**
     * Default return value for empty list
     */
    private final static int IS_EMPTY = -1;
    /**
     * Represents amount of nodes in linked list
     */
    private int nodeCounter = 0;

    /**
     * This method creates new node, adds it to linked list and sets node's value
     * @param i value to be set for node
     */
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

    /**
     * Checks if linked list is empty
     * @return true if linked list is empty, otherwise false
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Checks if linked list has reached maximum capacity
     * @return true if linked list is full, otherwise false
     */
    public boolean isFull() {
        return MAX_SIZE == nodeCounter;
    }

    //TODO: Add brackets to if for better readability and avoiding unintended bugs
    /**
     * Returns the value of last element in linked list
     * @return value of last element (int)
     */
    public int top() {
        if (isEmpty())
            return IS_EMPTY;
        return last.getValue();
    }

    //TODO: Add brackets to if for better readability and avoiding unintended bugs
    /**
     * Deletes last node and return it's value
     * @return value of last node
     */
    public int pop() {
        nodeCounter--;
        if (isEmpty())
            return IS_EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Represent one node in linked list
     * Used to hold integer value
     */
    private static class Node {

        private final int value;
        private Node prev;
        private Node next;

        /**
         * Creates new node with specified value
         * @param i value to initialize the node
         */
        protected Node(int i) {
            value = i;
        }

        /**
         * @return the value of node object
         */
        public int getValue() {
            return value;
        }

        /**
         * @return previous Node in linked list or null if there is not any
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Hold the reference to previous node
         * @param prev previous node in linked list
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * @return next Node in linked list or null if there is not any
         */
        public Node getNext() {
            return next;
        }

        /**
         * Hold the reference to next node
         * @param next next node in linked list
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
