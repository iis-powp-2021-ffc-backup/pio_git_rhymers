package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	public static final int INITIAL = -1;
	public static final int LENGTH = 12;
	public static final int RETURN = -1;

	private final int[] numbers = new int[LENGTH];

	public int total = INITIAL;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == INITIAL;
	}
		
	public boolean isFull() {
		return total == LENGTH-1;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return RETURN;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return RETURN;
		return numbers[total--];
	}

}