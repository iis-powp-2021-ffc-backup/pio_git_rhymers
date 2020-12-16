package edu.kis.vh.nursery;
//kombinacja alt + <- w Intellij zmienia kartę z wcześniej otwartym plikiem
public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());
        return ret;
    }
}
