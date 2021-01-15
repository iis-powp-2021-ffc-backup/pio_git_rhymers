package edu.kis.vh.nursery;

/**
 *
 */
public class defaultCountingOutRhymer {

	public static final int NUMBERS_AMOUNT = 12;
	public static final int DEFAULT_VALUE = -1;
	public static final int INITIAL_INDEX = -1;
	public static final int MAX_VALUE = 11;
	private final int[] numbers = new int[NUMBERS_AMOUNT];

	public int total = INITIAL_INDEX;

	/**
	 * @param in
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * @return
	 */
	public boolean callCheck() {
			return total == DEFAULT_VALUE;
		}

	/**
	 * @return
	 */
	public boolean isFull() {
				return total == MAX_VALUE;
			}

	/**
	 * @return
	 */
	protected int peekaboo() {
		if (callCheck())
			return DEFAULT_VALUE;
		return numbers[total];
	}

	/**
	 * @return
	 */
	public int countOut() {
		if (callCheck())
			return DEFAULT_VALUE;
		return numbers[total--];
	}

}
