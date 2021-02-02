package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();
        testRhymers(factory);
    }

    private static void testRhymers(RhymersFactory factory) {
        DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};
        //TODO: Take the place of magic numbers
        for (int i = 1; i < 15; i++) {
            for (DefaultCountingOutRhymer rhymer : rhymers) rhymer.countIn(i);
        }
        //TODO: import random, there's no another ambiguous name
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++) {
            rhymers[3].countIn(rn.nextInt(20));
        }

        for (DefaultCountingOutRhymer rhymer : rhymers) {
            while (!rhymer.callCheck()) {
                System.out.print(rhymer.countOut() + "  ");
            }
            System.out.println();
        }

        System.out.println("total rejected is " + ((HanoiRhymer)rhymers[3]).reportRejected());
    }
}