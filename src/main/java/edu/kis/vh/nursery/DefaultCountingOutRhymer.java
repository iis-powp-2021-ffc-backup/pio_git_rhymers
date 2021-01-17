package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


    private static int EMPTY_RHYMER_INDICATOR = -1;
    private final static int IS_EMPTY = -1;
    private final static int CAPACITY = 12;
    private final int[] numbers = new int[CAPACITY];

    public int getTotal() {
        return EMPTY_RHYMER_INDICATOR;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++EMPTY_RHYMER_INDICATOR] = in;
    }

    public boolean callCheck() {
        return EMPTY_RHYMER_INDICATOR == IS_EMPTY;
    }

    public boolean isFull() {
        return EMPTY_RHYMER_INDICATOR == CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return IS_EMPTY;
        return numbers[EMPTY_RHYMER_INDICATOR];
    }

    public int countOut() {
        if (callCheck())
            return IS_EMPTY;
        return numbers[EMPTY_RHYMER_INDICATOR--];
    }

}
