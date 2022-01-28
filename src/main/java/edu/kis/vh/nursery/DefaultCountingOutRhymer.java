package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	private static final int EMPTY = -1;//added final modifier
	private static final int NEGATIVE = -1;//added final modifier
	private static final int SIZE = 12;//added final modifier
	private static final int FULL = 11;//added final modifier
	private final int[] NUMBERS = new int[SIZE]; //added final modifier

	private int total = NEGATIVE;

	public static int getEMPTY() {
		return EMPTY;
	}

	public static int getNEGATIVE() {
		return NEGATIVE;
	}

	public static int getSIZE() {
		return SIZE;
	}

	public static int getFULL() {
		return FULL;
	}

	public int getTotal() {
		return total;
	}

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

	public int[] getNUMBERS() {
		return NUMBERS;
	}

}
