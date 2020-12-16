package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface RhymersFactory {

    defaultCountingOutRhymer GetStandardRhymer();

    defaultCountingOutRhymer GetFalseRhymer();

    defaultCountingOutRhymer GetFIFORhymer();

    defaultCountingOutRhymer GetHanoiRhymer();

}
