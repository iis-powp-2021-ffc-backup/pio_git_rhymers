package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public int total = MINUS_ONE;
    public static final int MINUS_ONE = -1;
    private final int[] NUMBERS = new int[TWELVE];
    public static final int TWELVE = 12;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUS_ONE;
    }

    public boolean isFull() {
        return total == 11;
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
