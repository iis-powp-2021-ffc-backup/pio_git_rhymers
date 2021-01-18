package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {
	public static final int START_CAP = -1;
	public static final int INITIAL_CAP = 12;
	public static final int MAX_CAPACITY = 11;

	private final int[] NUMBERS = new int[INITIAL_CAP];

	public int total = START_CAP;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == START_CAP;
	}

	public boolean isFull() {
		return total == MAX_CAPACITY;
	}

	protected int peekaboo() {
		if (callCheck())
			return START_CAP;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return START_CAP;
		return NUMBERS[total--];
	}

}
