package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    int total = -1;
    private final static int AMOUNT = 12;
    private final int[] numbers = new int[AMOUNT];

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == AMOUNT - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
