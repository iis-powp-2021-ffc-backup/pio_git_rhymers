package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0; //zmieniona linia

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())//zmieniona linia
			totalRejected++;
		else//zmieniona linia
			super.countIn(in);//zmieniona linia
	}
}
