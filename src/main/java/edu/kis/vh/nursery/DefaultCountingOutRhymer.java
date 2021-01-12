package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int START_VALUE = -1;
    public static final int SIZE = 11;
    public static final int SOME_ERROR = -1;

    private int[] numbers = new int[SIZE+1];

    public int total = START_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == START_VALUE;
    }

    public boolean isFull() {
        return total == SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return SOME_ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return SOME_ERROR;
        return numbers[total--];
    }

}
