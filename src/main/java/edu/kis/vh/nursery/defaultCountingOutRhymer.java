package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {
    public static final int MAX_CAP = 11;
    public static final int MINUS_ONE = -1;
    public static final int INIT_CAP = 12;

    public int total = MINUS_ONE;
    private final int[] NUMBERS = new int[INIT_CAP];


    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUS_ONE;
    }

    public boolean isFull() {
        return total == MAX_CAP;
    }

    protected int peekaboo() {
        if (callCheck())
            return MINUS_ONE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return MINUS_ONE;
        return NUMBERS[total--];
    }

}
