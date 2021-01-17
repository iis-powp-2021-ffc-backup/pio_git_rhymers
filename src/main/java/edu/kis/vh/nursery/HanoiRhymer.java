package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {
    public static final int INIT_REJECTED = 0;
    int totalRejected = INIT_REJECTED;


    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
