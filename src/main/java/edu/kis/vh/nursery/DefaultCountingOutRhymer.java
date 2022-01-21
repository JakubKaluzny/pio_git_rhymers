package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	public static final int EMPTY = -1;//added final modifier
	public static final int NEGATIVE = -1;//added final modifier
	public static final int SIZE = 12;//added final modifier
	public static final int FULL = 11;//added final modifier
	private final int[] NUMBERS = new int[SIZE]; //added final modifier

	public int total = NEGATIVE;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == NEGATIVE;
	}

	public boolean isFull() {
		return total == FULL;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY;
		return NUMBERS[total--];
	}

}
