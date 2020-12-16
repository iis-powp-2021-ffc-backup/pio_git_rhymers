package edu.kis.vh.nursery;
// alt + ←/→ skacze do poprzedniej pozycji wskaźnika w kodzie, również między plikami
public class HanoiRhymer extends defaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
